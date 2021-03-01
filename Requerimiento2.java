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
 * los 124,5 metros cuadrados del rectángulo, indicar que la superficie ha 
 * superado el valor permitido.
 * @author Gustavo
 */
public class Requerimiento2 {
    public static void main(String[] args) {
        float altura, base;
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura: "));
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite la base: "));
        
        float areaRectangulo = base*altura;
        float areaTriangulo = (base*altura)/2;
        
        System.out.println("El área del triángulo rectángulo es de " + areaTriangulo + " metros. ");
        if (areaRectangulo > 124.5){
            System.out.println("La superficie ha superado el valor permitido.");
        }
        else {
            System.out.println("El área del rectángulo es de " + areaRectangulo + " metros.");
        }
    }
}
