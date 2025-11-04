
package Ordenamiento;

import java.util.Arrays;




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
       
       System.out.println("");
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
           while (hueco > 0 && vector[hueco-1] > temp){
               vector[hueco] = vector[hueco-1];
               hueco = hueco-1;
           }
           
           vector[hueco] = temp; 
       }
       
       
       
   }
   
//   public void shellSort(int[] vector){
//       
//       int gap = vector.length /2 ;
//       
//       for(int i =  0; i < vector.length; i++){
//           
//           int temp = vector[i];
//           
//           for(int e = 1 + gap ;e<vector.length; e++ ){
//               
//               if(temp > vector[e]){
//                   int copia = vector[e];
//                   temp = vector[e];
//                   temp = copia; 
//                   break;
//               }
//               
//           }
//           
//           if(i == gap){
//               break ; 
//               }
//           
//       }
       
       
       
       
       
//   }
   
   public void shell(int[]vector){
       int salto,temp;
       salto = vector.length /2;
       
       while(salto>0){
           for(int i = salto; i < vector.length;i++){
               int j = i-salto;
               while(j>=0){
                   if(vector[j]>vector[j+salto]){
                       temp= vector[j];
                       vector[j]= vector[j+salto];
                       vector[j+salto]=temp;
                       j = j-salto;
                   }else{
                       j = -1;
                   }
               }
           }
           salto = salto/2; 
       }
   }
   
   //metodo para conteo de numeros pequeños en un vector
   public void coutingSort(int[] vector){
       
       
      int min = Arrays.stream(vector).min().orElse(0);
      int max = Arrays.stream(vector).max().orElse(Integer.MAX_VALUE);
       
       //cuenta cuantos de cada uno hay 
       int[] aux = new int[max-min+1];
       for(int i = 0; i < vector.length; i++){
           aux[vector[i]-min]= aux[vector[i]-min]+1;
       }
       
       //acumule el vector
       for(int i = 1; i<aux.length; i++){
           aux[i]= aux[i] + aux[i-1];
           
       }
       
       //Asigne en las nuevas posiciones
       int[] salida = new int[vector.length];
       for(int i = 0; i < vector.length;i++){
           int recorre = vector[i];
           int new_pos = aux[recorre-min]-1;
           salida[new_pos]= recorre;
           aux[recorre - min]= aux[recorre-min]-1;
           
       }
       
       for(int i =0; i< vector.length; i ++){
           vector[i]= salida[i];
       }
   }
   
   
   public void coutingSorRadix(int[] vector,int division){ //meter otor parametro que me idique y sefije en que posiciones se ejecuta el cauting
    
       //el tamaño del vector aux simepre sera 10
       
       //cuenta cuantos de cada uno hay 
       int[] aux = new int[10];
       for(int i = 0; i < vector.length; i++){
           aux[vector[i]]= aux[vector[i]]+1;
       }
       
       //acumule el vector
       for(int i = 1; i<aux.length; i++){
           aux[i]= aux[i] + aux[i-1];
           
       }
       
       //Asigne en las nuevas posiciones
       int[] salida = new int[vector.length];
       for(int i = vector.length; i >= 0 ;i--){
           int recorre = vector[i];
           int new_pos = aux[recorre-min]-1;
           salida[new_pos]= recorre;
           aux[recorre - min]= aux[recorre-min]-1;
           
       }
       
       for(int i =0; i< vector.length; i ++){
           vector[i]= salida[i];
       }
}
   
   //revisar codigo en casa 
   
   public void RadixSort(int[] vector ){
       
       
       for(int i = 0; i < vector.length; i++){
           int operacion = vector[i]/1;
           int division = operacion % 10; //% significa modulo de 10 
           
            coutingSorRadix(vector,division);
       }
       
       
       
       public int[] radixSort(int[]vector){
           int max = Arrys.stream(vector).max().orelse(Integer.MAX_VALUE);
           for(int exp = 1; max/exp > 0; exp*=10){
               vector = countingSor4radixsort(vector,exp);
           }
       }
       
       return vector; 
       
   }
    // erminar de adaptar el counting sort de modificarlo para que funcione 
}

