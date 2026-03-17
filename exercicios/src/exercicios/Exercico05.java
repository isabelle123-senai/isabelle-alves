package exercicios;

import java.util.Scanner;

public class Exercico05 {

	public static void main(String[] args) {
		
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int  numero = input.nextInt();
			
			imprimirNumeros(numero);
			
		}
		
		public static void imprimirNumeros( int numero) {
			
			for( int i = numero; i <= numero + 20;i++) {
				System.out.println(i);
				
			}
			
		}
	

	}


