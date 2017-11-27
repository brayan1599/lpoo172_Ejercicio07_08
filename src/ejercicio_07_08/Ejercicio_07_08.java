/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_08;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_08 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

		double[] valores = new double[10]; // Array of length 10

		// Prompt the user to enter ten double values
		System.out.print("Ingrese diez valores de tipo doble: ");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = input.nextDouble();
		}

		// Display the average value
		System.out.println("El valor promedio: " + average(valores));
	}

	/* Overloaded method average accepts an integer array and returns its average */
	public static int promedio(int[] array) {
		int promedio = 0; 
		for (int i: array)
			promedio += i;	// Add indexed value to average
		return promedio / array.length;
	}   

	/* Overloaded method average accepts an double array and returns its average */
	public static double average(double[] array) {
		double average = 0; 
		for (double i: array)
			average += i; // Add indexed value to average
		return average / array.length;
	}
}
   
    

