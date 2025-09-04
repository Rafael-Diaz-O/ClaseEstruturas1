package claseestructuras;


public class Lista {
    
    private Nodo cabeza; 
    private int tamano;
    
    public Lista(){
        this.cabeza= null; 
        this.tamano= 0; 
         
    }
    
     public void insertarNodoInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.siguiente = cabeza; 
        cabeza = nodoIni; 
    }
     
     public void insertarNodoFinal(int dato){
         Nodo nodoFin = new Nodo(dato);
         Nodo nodoRecorre = cabeza; // hise una copia 
         
         while (nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente;
         }
         
         nodoRecorre.siguiente = nodoFin;
     }
     
     public void insertarNodoIndice(int dato,int posicion ){ // insear nodo en un indice 
        
         Nodo nodoIndice = new Nodo(dato);
         Nodo nodoRecorre = cabeza;
         
         int cont = 0;
         while (cont <(posicion-1) && nodoRecorre.siguiente != null){
             nodoRecorre = nodoRecorre.siguiente; 
             cont ++;
         }
         if(cont == (posicion-1)){
         nodoIndice.siguiente = nodoRecorre.siguiente;
         nodoRecorre.siguiente = nodoIndice;
         }
}
     public void imprimirLista(){
         Nodo nodoRecorre = cabeza; 
         
         while (nodoRecorre != null){
             System.out.println(nodoRecorre.dato + "->");
             nodoRecorre = nodoRecorre.siguiente;
         }
         System.out.println("NULL");
     }
     
     public void eliminarNodoInicio(){
         Nodo inicio = cabeza; 
         cabeza = inicio.siguiente;
         inicio.siguiente = null; //romper el enlace
         tamano--;
     }

    
}