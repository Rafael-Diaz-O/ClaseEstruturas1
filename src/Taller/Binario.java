/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author USUARIO
 */
public class Binario {
     Nodo raiz;
    
    public Binario() {
        this.raiz = null;
    }
    
    // Método para insertar un valor en el árbol (árbol binario de búsqueda normal)
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        
        return actual;
    }
    
    // Método para reflejar el árbol binario
    public void reflejar() {
        raiz = reflejarRecursivo(raiz);
    }
    
    private Nodo reflejarRecursivo(Nodo nodo) {
        if (nodo == null) {
            return null;
        }
        
        // Intercambiar los subárboles izquierdo y derecho
        Nodo temp = nodo.izquierdo;
        nodo.izquierdo = reflejarRecursivo(nodo.derecho);
        nodo.derecho = reflejarRecursivo(temp);
        
        return nodo;
    }
    
    // Métodos para recorrer el árbol y mostrar su estructura
    public void inOrden() {
        System.out.print("Recorrido In-Orden: ");
        inOrdenRecursivo(raiz);
        System.out.println();
    }
    
    private void inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrdenRecursivo(nodo.derecho);
        }
    }
    
    public void preOrden() {
        System.out.print("Recorrido Pre-Orden: ");
        preOrdenRecursivo(raiz);
        System.out.println();
    }
    
    private void preOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
        }
    }
    
    // Método para mostrar la estructura del árbol de forma visual
    public void mostrarArbol() {
        System.out.println("Estructura del árbol:");
        mostrarArbolRecursivo(raiz, 0);
    }
    
    private void mostrarArbolRecursivo(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }
        
        mostrarArbolRecursivo(nodo.derecho, nivel + 1);
        
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(nodo.valor);
        
        mostrarArbolRecursivo(nodo.izquierdo, nivel + 1);
    }
}
