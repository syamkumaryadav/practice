package com.syam.programs;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = celsiusToFahrenheit(celsius);
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		scanner.close();
	}
	private static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
}