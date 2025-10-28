
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
       System.out.print("{" + vector[i] + "}");
   }
       
       System.out.println();
   }
   
   
public void seleccion(int[] vector){
    
    int temp;
    int pos_min_actual;
    
    for(int i = 0; i < vector.length -1; i ++ ){
        pos_min_actual = i;
        
        for(int j = i+1; j < vector.length; j++){
        if(vector[j]< vector[pos_min_actual]){ // estoy en la posicon comparando valores 
            pos_min_actual = j;
        }
        
        if(vector[pos_min_actual] < vector[i]){ //compara los dos
            temp = vector[i]; 
            vector[i] = vector[pos_min_actual];
            vector[pos_min_actual]= temp;// queda con un valor mayor en esa posicion
        }
    }
    }
    
}
    
    
   public void insecion(int[] vector){
       int temp;
       int pos_min_actual;
       
       for(int i = 0; i < vector.length; i ++){
           pos_min_actual =  i; 
           
            for(int j = i+1; j<vector.length; j++ ){
                if(vector[j]<vector[pos_min_actual]){
                   pos_min_actual = j; 
                }
            }
           
            if(vector[pos_min_actual] < vector[i]){
                
            }
           
           
       }
       
   }
   
   public void insercion(int[]vector){
       for(int i = 1; i < vector.length; i++){
           int temp = vector[i];
           int hueco = i;
           while (hueco )
       }
   }
    
    
}