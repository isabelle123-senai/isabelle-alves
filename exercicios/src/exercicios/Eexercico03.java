package exercicios;

import java.util.Scanner;

public class Eexercico03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" informe sua altura: ");
		double altura = input.nextDouble();
		
		System.out.println("informe seu peso em quilo: ");
		double peso  = input.nextDouble();
		
		double imc= peso / (altura * altura);
		
		if (imc < 18.5) {
				
		System.out.println("magreza ");
	} else if ( imc > 18.5 & imc < 24.9) {
		System.out.println("saudavel: ");
	} else if ( imc > 25.0 & imc < 24.9) {
		System.out.println("sobrepreso: ");
	} else if ( imc > 30.0 & imc < 34.9) {
		System.out.println("obesidadegrau 1: ");
	} else if ( imc > 35.0 & imc < 39.9) {
		System.out.println(" obesidade grau 2 ( severa): ");
	} else if ( imc > 40.0) {
		System.out.println("obecidade grau 3( morbida): ");
	}
		
	}
}
		



