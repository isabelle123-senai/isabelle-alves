package exercicios;

import java.util.Scanner;

public class exercico07 {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

	        System.out.println("Digite o número base: ");
	        int base = input.nextInt();

	        System.out.println("Digite o segundo número: ");
	        int num1 = input.nextInt();

	        System.out.println("Digite o terceiro número: ");
	        int num2 = input.nextInt();

	        verificarMaisProximo(base, num1, num2);

	        input.close();
	    }

	    // 
	    public static void verificarMaisProximo(int base, int num1, int num2) {

	        int distancia1 = Math.abs(base - num1);
	        int distancia2 = Math.abs(base - num2);

	        if (distancia1 < distancia2) {
	            System.out.println("O número mais próximo da base é: " + num1);
	        } else if (distancia2 < distancia1) {
	            System.out.println("O número mais próximo da base é: " + num2);
	        } else {
	            System.out.println("Os dois números estão à mesma distância da base.");
	        }
	    }
	

	}


