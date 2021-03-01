/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Requerimientos;
import javax.swing.JOptionPane;

/**
 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
 * rectángulo de altura n metros y la base de n metros. Cuando el área supere 
 * los 367,5 metros cuadrados del rectángulo, indicar que la superficie ha 
 * superado el valor permitido.
 * (implementado el algoritmo en un método separándolo del programa principal.)
 * @author Gustavo
 */
public class Requerimiento3 {
    public static void main(String[] args) {
        double base, altura;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite la base: "));
        
        System.out.println("El área del triángulo rectángulo es de " + areaTriangulo(altura, base) + " metros. ");
        
        if (areaRectangulo(base, altura) > 367.5){
            System.out.println("La superficie ha superado el valor permitido.");
        }
        else {
            System.out.println("El área del rectángulo es de " + areaRectangulo(altura, base) + " metros.");
        }
    }
    
    //Función área rectángulo
    public static double areaRectangulo(double a, double b){
        double c=a*b;
        return c;
    }
    //Función área triángulo rectángulo
    public static double areaTriangulo(double a, double b){
        double c=(a*b)/2;
        return c;
    }      
}        
        
    

