
package com.calculadora.logicanegocio;

/**
 *Esta clase contiene las funciones de potencia y raiz cuadrada
 * 
 * @author anthonyM
 * 
 * @version 1.0.20
 */
public class CalculadoraCientifica extends CalculadoraBasica{
    
     /**
     * Metodo que Calcula la potencia de un número entero.
     *
     * @param base El número base.
     * @param exponente El exponente al que elevar la base.
     * @return El resultado de la operación de potencia.
     */
    
    public  int calcularPotencia(int base, int exponente){
        int resultado=1;
        for (double i = 1; i <= exponente; i++) {
            resultado*=base;
            
        }
    
        return resultado;
    }
    
    /**
     * Metodo que Calcula la potencia de un número double.
     *
     * @param base El número base.
     * @param exponente El exponente al que elevar la base.
     * @return El resultado de la operación de potencia.
     */
    
    public  double calcularPotencia(double base, double exponente){
        int resultado=1;
        for (int i = 1; i <= exponente; i++) {
            resultado*=base;
            
        }
    
        return resultado;
    }
    
    /**
     * Metodo que calcula la raíz cuadrada de un número entero.
     *
     * @param numero El número del cual calcular la raíz cuadrada.
     * @return La raíz cuadrada del número como un valor double.
     */
    
    public double calcularRaizCuadrada(int numero){
    
        return Math.sqrt(numero);
    }
    

}
