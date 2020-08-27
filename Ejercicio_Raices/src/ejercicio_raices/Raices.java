/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_raices;

/**
 *
 * @author SAMSUNG
 */
public class Raices {
    private double a;
    private double b;
    private double c;
    
    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void obtenerRaices(){
        
        double x1 = (-b+Math.sqrt(criminal()))/(2*a);
        double x2 = (-b-Math.sqrt(criminal()))/(2*a);      
        
        System.out.println("Solucion x1: ");
        System.out.println(x1);
        System.out.println("Solucion x2: ");
        System.out.println(x2);
    }
    
    private void obtenerRaiz(){
        
        double x = (-b)/(2*a);
        
        System.out.println("Unica solucion:");
        System.out.println(x);
    }
    
    private double criminal(){
        //formula, b2-4ac
        return Math.pow(b, 2)-(4*a*c);
    }
    
    private boolean tieneRaices(){
        return criminal() > 0;
    }
    
    private boolean tieneRaiz(){
        return criminal() == 0;
    }
    
    public void calcular(){
        if (tieneRaices()) {
           obtenerRaices();
        }else if(tieneRaiz()){
           obtenerRaiz();
        }else{
            System.out.println("No tiene Raiz.");
        }
    }
}
