
package claseestructuras;


public class ListaEnlazada {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        lista.insertarNodoInicio(12);
        
        lista.insertarNodoInicio(34);
        lista.insertarNodoIndice(3, 4);
        lista.insertarNodoFinal(4);
        lista.insertarNodoFinal(5);
        lista.insertarNodoInicio(8);
        lista.insertarNodoIndice(13, 5);
        lista.imprimirLista();
        
        // si ingreso mas datos sea desde la cabeza o de la cola estos datos ya existentes se moveran al centro.
       
    }
    
}

