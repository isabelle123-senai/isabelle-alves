package exercico03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe05 {

	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite uma palavra:");
	        String palavra = sc.nextLine();

	        ArrayList<Character> lista = new ArrayList<>();

	        
	        for (int i = 0; i < palavra.length(); i++) {
	            lista.add(palavra.charAt(i));
	        }

	      
	        ArrayList<Character> invertida = new ArrayList<>(lista);

	       
	        Collections.reverse(invertida);

	        
	        boolean palindromo = true;

	        for (int i = 0; i < lista.size(); i++) {
	            if (lista.get(i) != invertida.get(i)) {
	                palindromo = false;
	                break;
	            }
	        }

	        if (palindromo) {
	            System.out.println("É palíndromo");
	        } else {
	            System.out.println("Não é palíndromo");
	        }

	        sc.close();
}
}

