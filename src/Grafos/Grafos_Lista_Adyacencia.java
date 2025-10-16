
package Grafos;

import Grafos.Grafos.*;

import java.util.LinkedList;
import java.util.Queue;

public class Grafos_Lista_Adyacencia {
    
    // lista de lista es lo mismo que ista de adyacencia 
    
    
    
    private LinkedList<Integer>[]adj;
    private int V;//numero de vetices 
    private int A;//numero de vertices
    
    public Grafos_Lista_Adyacencia(int nodos){
        this.V= nodos;
        this.A= 0;
        this.adj = new LinkedList[nodos];
        for(int v = 0; v<V; v++){
            adj[v] = new LinkedList<>();
        }
        
    }
    
    public void agregarArista(int u,int v){
        adj[u].add(v); //indico que a mi nodo u le agrego el valor de v 
        adj[v].add(u);
        A++;
        
    }
    
    public void imprimirGrafo(){
        for(int v =0; v<V; v++){
            System.out.println("Row" + v + ": ");
            for(int w = 0; w <adj[v].size(); w++ ){
                System.out.println(adj[v].get(w) + " ");
        }
            System.out.println("");
        }
    }
    
    //mi clase grafo y mi clase lista adyacencia hacen lo mismo en un inicio solo son dos formas de implementar  los mismo 
    
     public void imprimirEnAnchura(int inicio){ //inici desde donde quiero arrancar a leer 
       
       
           
           Queue<Integer> cola = new LinkedList<> (); // hago una cola de nodos 
           
           boolean [] visitado = new boolean [V];//creo un boleano donde todos losdatos seran falsos 
           visitado[inicio]= true;//hago que los datos sean verdaderos 
           cola.offer(inicio);//agrego elementos a mi cola 
           
           while (!cola.isEmpty()){
               int u = cola.poll();
               System.out.println(u + " ");
               
               for(int v : adj[u]){
                   if(!visitado[v]){
                       visitado[v] = true;
                       cola.offer(v);
                   }
               }
           
           
    
    
}

}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        