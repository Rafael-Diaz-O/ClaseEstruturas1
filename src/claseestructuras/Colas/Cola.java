
package claseestructuras.Colas;

import java.util.Stack;

public class Cola {
    
    private Nodo inicio;
    private Nodo fin;
    private int tamano;
    
    public Cola(){
        inicio = fin = null;
        tamano = 0; 
    }
    
    //agrego elementos
    public void enqueue(String dato){
        //Po rteoria nos toca asi y no usando un nodo recorre eso solo sirve para listas simples y dobles 
        Nodo nuevo = new Nodo(dato);
        
        if(fin == null){
            inicio = nuevo;
            
        }else{
         fin.siguiente = nuevo;
        }
        
        fin = nuevo;
        tamano++;
        System.out.println("Se ingresa el elemento " +  dato + " a la cola");
        
    }
    //elimino elementos
    public String dequeue (){
        
        Nodo aux = inicio;
        inicio  = inicio.siguiente;
        aux.siguiente = null;
        tamano--;
        return aux.dato;
        
    }
    
    
     public boolean isEmpty ()  {
        if(fin == null){
            System.out.println("La cola esta vacia ");
            return true;
        }
        else {
            System.out.println("La cola no esta vacia ");
            return false;
        }
    }    
    
    public void eliminar(){
        while(!isEmpty()){
            dequeue();
        }
    }
    
    
    public String peek(){
      
        System.out.println("La cola es " + fin.dato);
        return fin.dato;
        
    }
    
    
//    pila:
//    push = meter elementos
//    pop = sacar elementos
//    peek = ver el elemento superior
//    
    public void reordenadoDePalabras(){
        
    // Asumiendo que tienes un Nodo con la frase
    Nodo recorre = inicio;
    while(recorre.dato != null){
    if (recorre != null) {
        String texto = recorre.dato.toString(); // Ajusta según tu Nodo
        
        String[] palabras = texto.split(" ");
        Stack<String> pila = new Stack<>();//creo mi pila 
        
        // Apilar palabras invertidas
        for (String palabra : palabras) {
            pila.push(new StringBuilder(palabra).reverse().toString());
        }
        
        // Construir resultado
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
            if (!pila.isEmpty()) {
                resultado.append(" ");
            }
        }
        
        System.out.println(resultado.toString());
        recorre = recorre.siguiente;
    }
    }
} 
}
