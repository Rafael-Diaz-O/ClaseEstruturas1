
package Ordenamiento;


public class Burbuja {
    
   public void burbuja(int[] vector){
       int temp;
       
       for(int i = 0; i< vector.length - 1; i++){
           for(int j = i+ 1; j< vector.length; j++){
               if(vector[j] < vector[i]){
                   temp =  vector[i];
                   vector[i] = vector[j];
                   vector[j] = temp;
               }
           }
       }
   }
    
   
   public void imprimirVector(int [] vector){
       for(int i= 0; i < vector.length; i++){
       System.out.println(vector[i] + "");
   }
       
       System.out.println();
   }
   
   

    
    
    
    
}