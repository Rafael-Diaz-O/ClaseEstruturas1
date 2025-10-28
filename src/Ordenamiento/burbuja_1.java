
package Ordenamiento;




class burbuja_1  {
    
    
        
    public static void main(String[] args) {
        
        int[] vector = { 4,10,45,39,23,100,1};
        System.out.println("vector Original");
        Burbuja o = new Burbuja();
        o.imprimirVector(vector);
        
        System.out.println("Vector Ordenado burbuja");
        o.burbuja(vector);
        o.imprimirVector(vector);
    
        
      
        
        
    
    
}
}
