
package Arboles;


public class Nodo {
    
    public int dato;
    public Nodo siguiente; 
    public Nodo hijoIzquierdo;
    public Nodo hijoDerecho;
    
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        
    }
    
    
}
