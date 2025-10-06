
package claseestructuras.Colas;



public class Colass {
    
    public static void main(String[] args) {
        
        Cola cola  = new Cola();
        
        cola.enqueue("Hola");
        cola.enqueue("solo se que nada se");
        cola.enqueue("Derek");
        
        cola.peek();
        
        cola.reordenadoDePalabras();
       
    }
    
}
