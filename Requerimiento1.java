/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Requerimientos;

/**
 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
 * rectángulo de altura 3 metros y la base de 4 metros. 
 * @author Gustavo
 */
public class Requerimiento1 {
    public static void main(String[] args) {
        int base = 4;
        int altura = 3;
        
        int areaRectangulo = base*altura;
        int areaTriangulo = (base*altura)/2;
        
        System.out.println("El área del rectángulo es de " + areaRectangulo + " metros.");
        System.out.println("El área del triángulo es de " + areaTriangulo + " metros.");
    }
}
