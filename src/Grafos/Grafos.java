
package Grafos;

import Arboles.Nodo;
import java.util.LinkedList;
import java.util.Queue;


public class Grafos {
    
    private int V;
    private int A;
    private int [][] matrizAdyacencia;
    
    public Grafos(int nodos){
        this.V = nodos;//numero de vertices 
        this.A = 0;//numero de aristas
        this.matrizAdyacencia = new int[nodos][nodos];
    }
    
    public void agregarArista(int u,int v){
        matrizAdyacencia[u][v] = 1;
        matrizAdyacencia[v][u] = 1; // no-dorogido ose coneto el grafo y se puede mover de u a v y de v a u 
        A++;
    }
    
    public void imprimirGrafo(){
        for(int v= 0; v<V; v++){
            System.out.println("\t Fila" + v + ":");
            for(int w = 0; w<V; w++){
                System.out.println(matrizAdyacencia[v][w]+ "" );
            }
        }
        System.out.println("");
    }
    
    
    //pensar el metodo de imprimir en anchura trabajar en este metodo
     public void imprimirEnAnchura(){
       
       if(matrizAdyacencia == null){
           System.out.println("Esta vacio");
       }else{
           Queue<Nodo> cola = new LinkedList<Nodo> (); // hago una cola de nodos 
           cola.add(matrizAdyacencia);
           while(cola.size() != 0){
               
               Nodo nodo = cola.poll();
               
               System.out.println("" +  nodo.dato);
               
               if(nodo.hijoIzquierdo != null){
               cola.add(nodo.hijoIzquierdo);
           }
               if(nodo.hijoDerecho != null) {
               cola.add(nodo.hijoDerecho);
           }
               
           }
          
       }
    
    
}
