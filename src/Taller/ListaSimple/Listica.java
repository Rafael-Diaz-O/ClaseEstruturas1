
package Taller.ListaSimple;


public class Listica {
     
    public static void main(String[] args) {
        
        Lista1 numeros = new Lista1();
        
        numeros.insertarNodoInicio(6);
        numeros.insertarNodoFinal(9);
        numeros.insertarNodoInicio(6);
        numeros.insertarNodoInicio(1);
        numeros.insertarNodoInicio(1);
      
        
        System.out.println("Lista: ");
        numeros.imprimirLista();
        
        System.out.println("Lista sin elementos repetidos: ");
        numeros.eliminarDuplicados();
        numeros.imprimirLista();
    }
    
}
