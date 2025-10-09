
package Taller.Pilas;

import java.util.Stack;


public class Pila {
    
    private Nodo cima;
    private int tamano;
    
    public Pila(){
        cima = null;
        tamano = 0; 
    }
    
    // push para ingresar 
    public void push(String dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;
        System.out.println("Se ingresa el elemento " +  dato + " a la pila");
    }
    
    //pop para elminar
    public String pop(){
        Nodo aux = cima;
        cima = cima.siguiente;
        tamano--;
        System.out.println("se saco el elemento" +  aux.dato + "de pila.");
        return aux.dato;
    }
    
    
    //muestra la cima 
    public String peek(){
      
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
    
    public void imprimirLista(){
        
        Nodo recorre = cima;
        System.out.println("Incio");
        
            while(recorre != null){
                System.out.println(recorre.dato+ "->");    
                recorre = recorre.siguiente;
            }
            
            System.out.println("Null");
        
    }
   
    
    
    
public void reordenadoDePalabras() {
    Nodo dato = cima;  // Empezamos desde la cima
    int cont = tamano;  // Número de elementos en la pila
    
    // Recorremos cada dato de la pila
    while(cont != 0 && dato != null){ //Comprobamos si el nodo no esta basio 
        //Obtener el texto del nodo actual
        String texto = dato.dato.toString();
        
        //Dividir en palabras
        String[] palabras = texto.split(" ");
        Stack<String> pila = new Stack<>();
        
        //Apilar palabras invertidas
        for (String palabra : palabras) {
            pila.push(new StringBuilder(palabra).reverse().toString());
        }
        


        //Construir resultado desapilando
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) { //Pila tiene 1 elemento
            resultado.append(pila.pop());// Agrega la palabra 
            if (!pila.isEmpty()) {//Pila está VACÍA - NO ejecuta
                resultado.append(" ");// NO se agrega espacio
            }
        }
        
        //Mostrar resultado para el nodo en el que estamos
        System.out.println("Frase: " + resultado.toString());
        
        //Avanzar al siguiente nodo
        dato = dato.siguiente;
        //Actualizar el contador
        cont--; 
    }
}
}
