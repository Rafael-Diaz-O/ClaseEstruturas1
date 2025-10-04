
package Pilas;


public class Pila {
    
    private Nodo cima;
    private int tamano;
    
    public Pila(){
        cima = null;
        tamano = 0; 
    }
    
    // push para ingresar 
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;
        System.out.println("Se ingresa el elemento " +  dato + " a la pila");
    }
    
    //pop para elminar
    public int pop(){
        Nodo aux = cima;
        cima = cima.siguiente;
        tamano--;
        System.out.println("se saco el elemento" +  aux.dato + "de pila.");
        return aux.dato;
    }
    
    
    //muestra la cima 
    public int peek(){
      
        System.out.println("La cima es " + cima.dato);
        return cima.dato;
        
    }
       
            
    //vacio        
    public boolean isEmpty ()  {
        if(cima == null){
            System.out.println("La pila esta vacia ");
            return true;
        }
        else {
            System.out.println("La pila no esta vacia ");
            return false;
        }
    }    
    
    public void eliminarPila(){
        while(!isEmpty()){
            pop();
        }
    }
    
    
    
}
