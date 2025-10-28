
package Ordenamiento;


public class Burbuja {
    
   
    
    
    public static void main(String[] args) {
        
        
        
         int [] numero = {12,3,56,24,86};
         int []resultado = {} ; 
         
       
       
       for(int i=0; i < numero.length; i++){
           
           if(numero[i] < numero[i+1]){
               resultado [i] = numero[i];
           }else{
               resultado[i]= numero[i+1];
           }
           
           
       }
       
        System.out.println(resultado);
        
        
    
    
}
}