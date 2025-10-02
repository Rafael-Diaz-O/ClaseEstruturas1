
package Arboles;

 
public class CorreArbol {
    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol();
        
        arbolito.ingresarDato(4);
        arbolito.ingresarDato(3);
        arbolito.ingresarDato(2);
        arbolito.ingresarDato(1);

//    arbolito.meterDato(4);
//    arbolito.meterDato(3);
//    arbolito.meterDato(2);
//    arbolito.meterDato(5);

      arbolito.preOrden(arbolito.raiz);//  ingresamos el dato de tipo nodo que hara que recorra las raices de arbolito
      
      //arbolito.inOrden(arbolito.raiz);

      
//      arbolito.busqueda(1);

      
      

    }
    
}
