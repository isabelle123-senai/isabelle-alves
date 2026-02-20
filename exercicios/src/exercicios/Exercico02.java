package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercico02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.println("Informe seu nome: ");
		String nome = input.next();
		
		System.out.println("Informe seu salario fixo: ");
		double salario = input.nextDouble();
		
		
		System.out.println(" Qual o total de valor do mês: ");
		double mes= input.nextDouble();
		

	}

}
