
package Pilas;


public class Pila {
    
    private Nodo cima;
    private int tamano;
    
    public Pila(){
        cima = null;
        tamano = 0; 
    }
    
    
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;
        System.out.println("Se ingresa el elemento " +  dato + "a la pila");
    }
    
    
    public int pop(){
        Nodo aux = cima;
        cima = cima.siguiente;
        tamano--;
        System.out.println("se saco el elemento" +  aux.dato + "de pila.");
        return aux.dato;
    }
    
}
