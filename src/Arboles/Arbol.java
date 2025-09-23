
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
    
}
