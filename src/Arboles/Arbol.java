
package Arboles;

import java.util.Queue;
import java.util.LinkedList;

public class Arbol {
    
    protected Nodo raiz;
    private int tamaño;
    
    public Arbol(){
        this.tamaño = 0;
        this.raiz = null;
    }
    
    //verifica si el arbol esta vacio y sele avisa al usuario
    public void vacio(){
        if (raiz == null){
            System.out.println("el arbol esta vacio");
        }else{
            System.out.println("el arbol no esta vacio");
        }
    }
    //verificacion en segundo plano que solo corra si es verdadero o falso pero no sele indique al usuario
    
    public boolean estaVacio(){
        if(raiz== null){
            return true;
        }else{
            return false; 
        }
    }
    
    //Estudiar el metodo de agregar de manera secuencial 
    public void insertarDatos(int dato){
        Nodo nuevo = new Nodo(dato);
        Nodo recorre = raiz;
        
        while(recorre != null){
        if(estaVacio()){ // solo se puede usar el metodo que usa logica booleana
            System.out.println("Esta vacio");
        }else if(raiz.dato < nuevo.dato){  // con .dato estaria comparando ahora si los dos datos
            recorre = nuevo.hijoIzquierdo;
        }else {
            recorre = nuevo.hijoDerecho;
        }
        }
        
        
        
    }
    
    //Metodo recursivo
    public void meterDato(int dato){
        
        Nodo nuevo = new Nodo(dato);
        if(estaVacio()){
        this.raiz = nuevo;
        }else{
            
            Nodo actual = raiz;
            Nodo padre; 
            
            //insertar en el lado izquierdo
        if (dato < nuevo.dato){
            padre = actual;
            if(nuevo.hijoIzquierdo == null){
                padre.hijoIzquierdo = new Nodo(dato);
            }else{
                meterDato(dato);
            }
            
        }else{ // insertar en el lado derecho
            padre = actual;
            if(nuevo.hijoDerecho ==  null){
                padre.hijoDerecho =  new Nodo(dato);
            }else{
                meterDato(dato);
            }
        }
        
            
            
            
        }
        
    }
    
    
     // metodo de forma secuencial 

    public void ingresarDato(int dato){
        
         Nodo nuevo = new Nodo(dato);
        if(estaVacio()){
        this.raiz = nuevo;
        }else{
            
            Nodo actual = raiz;
            Nodo padre; 
            
            while(dato < actual.dato){ // preguntar si esto podria dar un bucle infinito
          
             padre = actual;//lo que hago es actualzar el padre  de esa subrais 
                 
        if(actual.hijoIzquierdo == null){
           padre.hijoIzquierdo = nuevo;
          
            break;
        }else{
            
            actual = actual.hijoIzquierdo;
        }

        }
        
        while (dato > actual.dato){
            padre = actual;
            if(raiz.hijoDerecho == null){
                padre.hijoDerecho = nuevo;
                break;
            }else{
                actual = actual.hijoDerecho;
            }
        }
        
            
        }
        
        
        
         
}
    
    //tarea hacer el codig recursivo de la profe que esta en las diapos 
    
    public void insertarArbolRecursive(int datoRecibido){
        raiz = insertarRecusive(raiz, datoRecibido);     /// la raiz sera igual al valor que ingrese en mi metodo
        // de tipo Nodo el metodo insertarRecusive
        tamaño++;
}
    
   private Nodo insertarRecusive(Nodo raiz, int dato){
    if (raiz == null) {
        return new Nodo(dato);  // Caso base: crea nuevo nodo
    }

    if (dato < raiz.dato) {
        raiz.hijoIzquierdo = insertarRecusive(raiz.hijoIzquierdo, dato);  // Inserta en la izquierda
    } else {
        raiz.hijoDerecho = insertarRecusive(raiz.hijoDerecho, dato);  // Inserta en la derecha
    }

    return raiz;  // Retorna el nodo actualizado
    
    
    
}
   
   
   public void imprimirDeFormaHorizontal(){
       
       if(estaVacio()){
           System.out.println("Esta vacio");
       }else{
           Queue<Nodo> cola = new LinkedList<Nodo> (); // hago una cola de nodos 
           cola.add(raiz);
           while(cola.size() != 0){
               
               Nodo nodo = cola.poll();
               
               System.out.println("" +  nodo.dato);
               
               if(nodo.hijoIzquierdo != null){
               cola.add(nodo.hijoIzquierdo);
           }
               if(nodo.hijoDerecho != null) {
               cola.add(nodo.hijoDerecho);
           }
               
           }
          
       }
       
       
       
   }
   
   //imprimir de forma verical 
   
   public void preOrden(Nodo nodito){ // raiz, izquierda, derecha
       
       if(nodito != null){
           
           System.out.println(nodito.dato);
           preOrden(nodito.hijoIzquierdo);// recorre hasta llegar al ltimo dato de izquierdo
           //llego a que sea cero y me salgo de mi meotodo de hizo izquerdo y entonces saltaria ahora al de hijo derecho 
           preOrden(nodito.hijoDerecho);// recorre hasta llegar al ultimo dato de izquierdo 
           
           
       }
   }
   
    public void inOrden(Nodo nodito){ //izquierda, muestra raiz , derecha
       
       if(nodito != null){
           
           
           inOrden(nodito.hijoIzquierdo);// recorre hasta llegar al ltimo dato de izquierdo
           //llego a que sea cero y me salgo de mi meotodo de hizo izquerdo y entonces saltaria ahora al de hijo derecho 
           System.out.println(nodito.dato);
           inOrden(nodito.hijoDerecho);// recorre hasta llegar al ultimo dato de izquierdo 
           
           
       }
   }

    
      public void postOrden(Nodo nodito){ //izquierda, muestra raiz , derecha
       
       if(nodito != null){
           
           
           postOrden(nodito.hijoIzquierdo);// recorre hasta llegar al ltimo dato de izquierdo
           //llego a que sea cero y me salgo de mi meotodo de hizo izquerdo y entonces saltaria ahora al de hijo derecho 
           postOrden(nodito.hijoDerecho);// recorre hasta llegar al ultimo dato de izquierdo 
           System.out.println(nodito.dato);
           
           
       }
   }

    
}