/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Temperatura {
    
    /**
     * Conversor de temperatura Celsius para Fahreneit
     * @param temp 
     * @return temperatura
     */
    public Double CelsiusParaFahreneit(double temp){
      return 9.0 * temp / 5.0 + 32.0; 
    };
    
    /**
     * Conversor de temperatura Celsius para Kelvin
     * @param temp 
     * @return temperatura
     */
    public Double CelsiusParaKelvin(double temp){
      return temp + 273.15;
    };
    
    /**
     * Conversor de temperatura Fahreneit para Celsius
     * @param temp 
     * @return temperatura
     */
    public Double FahreneitParaCelsius (double temp){
      return 5.0 * (temp - 32.0) / 9.0 ;
    };
    
    /**
     * Conversor de temperatura Fahreneit Para Kelvin
     * @param temp
     * @return
     */
    public Double FahreneitParaKelvin (double temp){
      return (5.0 * (temp - 32.0) / 9.0) + 273.15;
    };
    
    /**
     * Conversor de temperatura Kelvin Para Celsius
     * @param temp
     * @return
     */
    public Double KelvinParaCelsius(double temp){
      return temp - 273.15;
    };
    
    /**
     * Conversor de temperatura Kelvin Para Fahreneit
     * @param temp
     * @return
     */
    public Double KelvinParaFahreneit(double temp){
      return  9.0 * (temp - 273.15) / 5.0 + 32.0;
    };
}
