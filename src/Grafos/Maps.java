
 
package Grafos;


public class Maps {
    
    
    public static void main(String[] args) {
        
        Grafos_Lista_Adyacencia g = new Grafos_Lista_Adyacencia(4); //la cantidad de nodos 
        g.agregarArista(0, 1);//agrego los nodos y sus respetivas conexiones 
        g.agregarArista(1, 2);
        g.agregarArista(2, 3);
        g.agregarArista(3, 0);
        g.imprimirGrafo();
        System.out.println("BFS");   
        g.imprimirEnAnchura(1);
    }
}
