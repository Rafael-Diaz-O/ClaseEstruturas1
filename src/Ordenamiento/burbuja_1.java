
package Ordenamiento;




class burbuja_1  {
    
    
        
    public static void main(String[] args) {
        
        int[] vector = { 4,3,2,2,1,6};
        System.out.println("vector Original");
        Burbuja o = new Burbuja();
       o.imprimirVector(vector);
//        
//        System.out.println("Vector Ordenado burbuja");
//        o.burbuja(vector);
//        o.imprimirVector(vector);
//    
//        System.out.println("Metodo de seleccion ");
//       o.seleccion(vector);
//       o.imprimirVector(vector);
       
        
//        System.out.println("Metodo Ordenado ShellSort");
//        o.shellSort(vector);
//        o.imprimirVector(vector);
//        System.out.println("prueba");
//    

     o.coutingSort(vector);
     o.imprimirVector(vector);


        
        
}
}
