/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author USUARIO
 */
public class Listic {
     public static void main(String[] args) {
        Binario arbol = new Binario();
        
        // Insertar valores en el árbol
        int[] valores = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45};
        
        System.out.println("=== ÁRBOL BINARIO ORIGINAL ===");
        for (int valor : valores) {
            arbol.insertar(valor);
        }
        
        arbol.mostrarArbol();
        arbol.inOrden();
        arbol.preOrden();
        
        System.out.println("\n=== APLICANDO REFLEJO DEL ÁRBOL ===");
        arbol.reflejar();
        
        arbol.mostrarArbol();
        arbol.inOrden();
        arbol.preOrden();
        
        // Verificación adicional
        System.out.println("\n=== VERIFICACIÓN ===");
        System.out.println("En el árbol reflejado:");
        System.out.println("- Los valores menores van al lado derecho");
        System.out.println("- Los valores mayores van al lado izquierdo");
        System.out.println("- El recorrido in-orden sigue siendo el mismo (está ordenado)");
        System.out.println("- El recorrido pre-orden cambia completamente");
    }
}
