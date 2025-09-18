
package Colas;

import java.util.LinkedList;


public class Expriento {
    
    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList();
        
        lista.add(10);
        lista.add(30);
        
        int tamano = lista.size();
        
        int i = 0;
        
        System.out.println("Inicio");
        while (i<tamano){
            System.out.println("->" + lista.get(i));
            i++;
        }
        
        System.out.println("");
        
    }
    
    
}
