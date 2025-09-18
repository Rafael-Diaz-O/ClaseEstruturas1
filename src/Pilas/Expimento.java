
package Pilas;

import java.util.Stack;

public class Expimento {
    
    public static void main(String[] args) {
        
        Stack pila = new Stack ();
        
        pila.add(1);
        pila.add(2);
        
        System.out.println("La cima de la pila es " + pila.peek());
        System.out.println("Sacado elemento de la pila " +  pila.pop());
        System.out.println(" Tamano de la pila es " + pila.size());
        
        
        
        
        
        
        
    }
    
    
}
