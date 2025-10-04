
package Taller.ListaSimple;


public class Listica {
     
    public static void main(String[] args) {
        
        Lista1 numeros = new Lista1();
        
        numeros.insertarNodoInicio(3);
        numeros.insertarNodoFinal(6);
        numeros.insertarNodoInicio(3);
        numeros.insertarNodoInicio(3);
        numeros.imprimirLista();
        numeros.eliminarDuplicados();
        numeros.imprimirLista();
    }
    
}
