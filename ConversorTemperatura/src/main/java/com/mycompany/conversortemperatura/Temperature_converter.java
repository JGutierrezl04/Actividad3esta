package com.mycompany.conversortemperatura;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.print("E Introduce el valor que quieres convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para Celsius a Fahrenheit y convertirlo");
	System.out.println("  Introduce 1 para Fahrenheit a Celsius y convertirlo");
	System.out.print("\nIntroduce el valor aqui");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversion esta aqui"+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu convesion esta aqui"+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
