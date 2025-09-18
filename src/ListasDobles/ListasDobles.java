
package ListasDobles;

public class ListasDobles {
    
    
    public static void main(String[] args) {
        
        Lista2 lista = new Lista2();
        
        lista.insertarNodoInicio(3);
        lista.insetarNodoFin(4);
        //lista.imprimirListaIniAFin();
        //lista.eliminarNodoInicio();
        
        /*
        System.out.println("Despuede haber borrado ");
        
        lista.imprimirListaFinAInicio();
        lista.imprimirListaIniAFin();
        */
        System.out.println("Eliminar inidice ");
        
        lista.insertarNodoInidce( 6,1);
        lista.imprimirListaFinAInicio();
        lista.imprimirListaIniAFin();
        System.out.println("tamaño" + lista.getTamaño());
        
        
        System.out.println("Dato eliminado");
        lista.imprimirListaIniAFin();
        lista.imprimirListaFinAInicio();
        
        //hola
        
    }
    
    
    
  
    
}
