
package claseestructuras;

//lista enlazada simple 
public class ListaEnlazada {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        lista.insertarNodoInicio(1);
        lista.insertarNodoFinal(4);
        lista.insertarNodoFinal(5);
//        lista.insertarNodoInicio(8);
//        lista.insertarNodoIndice(13, 3);
        //lista.imprimirLista();
        //lista.eliminarNodoFinal(); 
        //lista.eliminarIndice(1);
        lista.imprimirLista();
        lista.buscador(5);
        lista.buscadorDeValore(1);
       
        // si ingreso mas datos sea desde la cabeza o de la cola estos datos ya existentes se moveran al centro.
       
    }
    
}

