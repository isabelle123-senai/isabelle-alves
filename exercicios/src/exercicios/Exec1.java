package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
		DecimalFormat dec = new DecimalFormat("0.00");
		 
		System.out.println("Informe seu cadastro: ");
		int cad = input.nextInt();
		
		System.out.println("Informe seu nome: ");
		String nome = input.next();
		
		System.out.println("Informe quantas horas vc trabalha semanalmente: ");
		double hora = input.nextDouble();
		
		System.out.println("Informe o valor que voce ganha por hora: ");
		double valor = input.nextDouble();
		
		double salario = (hora * 4)* valor;
		
		System.out.println(" seu cadstro é : " + cad + " seu nome é: "+ nome+ " seu salario é: "+ dec.format(salario));
		
		
				

	}

}
