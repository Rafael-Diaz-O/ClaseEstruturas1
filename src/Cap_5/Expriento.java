/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap_5;

public class Expriento {
    
    
    public static int sumarHastav1(int n){
        int total =0;
        for(int i = 1; i <= n; i++){
            total = total + i;
        }
        return total;
    }
    
    public static int sumarHastav2(int n){
        return n*(n+1)/2;
    }
    
    public static void main(String[] args) {
        
        long horaInicial,horaFinal;
        double tiempoEjecucionSecs;
        horaInicial = System.nanoTime();
        
        long total2 = sumarHastav1(1000000000);
        System.out.println("total: " + total2);
        
        horaFinal = System.nanoTime();
        tiempoEjecucionSecs =(horaFinal - horaInicial)/10e9;
        
        System.out.println("hora inicial: " + horaInicial);
        System.out.println("hora final: " + horaFinal);
        System.out.println("resta: " + (horaFinal - horaInicial));
        System.out.println("tiempoEjec: "  + tiempoEjecucionSecs);
               
        
        
    }
    
}
