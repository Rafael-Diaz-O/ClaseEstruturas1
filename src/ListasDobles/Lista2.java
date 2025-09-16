
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
    
    
    public void insertarNodoInidce(int dato,int posicion){
        
        Nodo2 nuevo = new Nodo2 (dato);
        Nodo2 recorre;
        
        if(cabeza == null && posicion != 0 ){
            
            System.out.println("Posicion no existe");
        }else if(cola == null && posicion == 0){
            cabeza = nuevo; 
            cola = nuevo;
        }else{
            recorre = cabeza;
            int cont = 0;
            
             while (cont < posicion-1 && recorre.siguiente != null){
                 recorre = recorre.siguiente;
                 cont++;
             }
            
             if(cont == posicion-1){
            nuevo.siguiente = recorre.siguiente;
            nuevo.anterior = recorre;
            
            recorre.siguiente.anterior = nuevo;
            recorre.siguiente = nuevo;
            
        }else{
                 System.out.println("Posicion no existe ");
             }
             
            
             
        }
        
        
        tamaño++;
        
    }
    
    public void eliminarNodoInicio(){
        
        if(cabeza == null){
            System.out.println("Nada por eliminar");
        }else if(cabeza == cola){
            cola =null;
            cabeza =null; 
        }else{
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            tamaño--;
        }
         
     }
    
    
    public void eliminarNodoFinal(){
         if (cabeza== null){
             System.out.println("Nada por eliminar");
     }else if(cabeza == cola ){
             cola = null;
             cabeza = null;
             tamaño --;
    }else {
         cola = cola.anterior;
         cola.siguiente = null;
         tamaño--;
     }

    
    }
    
    public void eliminarNodoIndice(int posicion){
        
        Nodo2 recorre;
        
        if(cabeza == null){
            System.out.println("Nada por eliminar ");
        }else if(cabeza == cola){
            cola = null;
            cabeza = null;
        }else{
            recorre = cabeza;
            int cont = 0;
            
            while ( cont < posicion && recorre.siguiente != null){
                recorre = recorre.siguiente;
                cont++;
            }
       
        
          if(cont == posicion){
              recorre.siguiente = recorre.siguiente.siguiente; //llego al nodo que quieor enlazar por quejemplo tengo lista de tamaño 1,2,3 entonces con esto paso se 1 a 3 
              recorre.siguiente.anterior = recorre;// con esto me devuelvo de 3 a 1 relamente cuando dices me devuelo es que los estas en lazando asiendo haci que el nodo sea eliminado 
              tamaño--;
            
            }else{
              System.out.println("Posicion no existente");
          }
 
        
           }
    
    }
}
