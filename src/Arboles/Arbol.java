
package Arboles;


public class Arbol {
    
    private Nodo raiz;
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
    
}
