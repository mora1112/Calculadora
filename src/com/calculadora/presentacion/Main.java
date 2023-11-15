
package com.calculadora.presentacion;

import com.calculadora.logicanegocio.CalculadoraCientifica;

/**
 *
 * @author antho
 */
public class Main {
    
   public static void main(String args[]){
       
       CalculadoraCientifica c= new CalculadoraCientifica();
       
       System.out.println(c.calcularPotencia(2,2));
       System.out.println(c.calcularRaizCuadrada(80));
       
       
       
   
   }
    
}
