
package Grafos;

import java.util.LinkedList;

public class Grafos_Lista_Adyacencia {
    
    
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
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        