
package Colas;

public class Cola {
    
    private Nodo inicio;
    private Nodo fin;
    private int tamano;
    
    public Cola(){
        inicio = fin = null;
        tamano = 0; 
    }
    
    
    public void enqueue(int dato){
        //Po rteoria nos toca asi y no usando un nodo recorre eso solo sirve para listas simples y dobles 
        Nodo nuevo = new Nodo(dato);
        
        if(fin == null){
            inicio = nuevo;
            
        }else{
         fin.siguiente = nuevo;
        }
        
        fin = nuevo;
        tamano++;
        System.out.println("Se ingresa el elemento " +  dato + " a la pila");
        
    }
    
    public int dequeue (){
        
        Nodo aux = inicio;
        inicio  = inicio.siguiente;
        aux.siguiente = null;
        tamano--;
        return aux.dato;
        
    }
    
    
    
    
    
}
