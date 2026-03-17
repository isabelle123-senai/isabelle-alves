package exercicios;

import java.util.Scanner;

public class exercico08 {
	

	    public static void ana() {
	        System.out.println("O nome dela é Ana");
	        System.out.println("Ela tem 16 anos");
	        System.out.println("Ela é estudante de desenvolvimento de sistemas");
	    }

	    public static void bruno() {
	        System.out.println("O nome dele é Bruno");
	        System.out.println("Ele tem 17 anos");
	        System.out.println("Ele é estudante de desenvolvimento de sistemas");
	    }

	    public static void carlos() {
	        System.out.println("O nome dele é Carlos");
	        System.out.println("Ele tem 18 anos");
	        System.out.println("Ele é estudante de desenvolvimento de sistemas");
	    }

	    public static void main(String[] args) {

	    	Scanner input = new Scanner(System.in);
			

	        System.out.println("Digite o nome do colega:");
	        String nome = input.nextLine();

	        if (nome.equalsIgnoreCase("ana")) {
	            ana();
	        } else if (nome.equalsIgnoreCase("bruno")) {
	            bruno();
	        } else if (nome.equalsIgnoreCase("carlos")) {
	            carlos();
	        } else {
	            System.out.println("Colega não encontrado.");
	        }

	        input.close();
	    }
	}

