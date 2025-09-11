
package ListasDobles;


public class Lista2 {
    
    private Nodo2 cabeza,cola;
    private int tamaño;
    
    public Lista2(){
        this.cabeza = cabeza;
        this.cola = cola; 
    }

    public int getTamaño() {
        return tamaño;
    }

    public void listaVacia(){
        if(cabeza == null){
            System.out.println("La lista se encuentra vacia");
        }else{
            System.out.println("La lista esta llena");
        }
    }
    
    public void     imprimirListaIniAFin(){
        Nodo2 nodoRecorre = cabeza;
        
        System.out.println("cabeza ->");
        while (nodoRecorre != null){
            System.out.println(nodoRecorre.dato + "->");
            nodoRecorre = nodoRecorre.siguiente; 
        }
        
        System.out.println("FINAL");
        
                
          
    }
    
    public void     imprimirListaFinAInicio(){
        Nodo2 nodoRecorre = cola;
        
        System.out.println("fINAL>");
        while (nodoRecorre != null){
            System.out.println(nodoRecorre.dato + "->");
            nodoRecorre = nodoRecorre.anterior; 
        }
        
        System.out.println("INICIAL");
                
          
    }
    
    public void insertarNodoInicio(int dato){
        Nodo2 nuevo = new Nodo2(dato);
        
        if(cabeza  == null){
            cola = nuevo;
        }else{
            cabeza.anterior = nuevo;
        }
        
        nuevo.siguiente = cabeza;
        nuevo.anterior = null;
        
        cabeza = nuevo;
        tamaño++;
            
    }
    
    public void insetarNodoFin(int dato){
        
        Nodo2 nuevo = new Nodo2(dato);
                
        if(cola == null){
            cabeza = nuevo;
        }else{
        cola.siguiente = nuevo;
        nuevo.anterior = cola;
      }
        
      cola = nuevo;
      tamaño++;
        
        
    }
    
    
    
    
    
}
