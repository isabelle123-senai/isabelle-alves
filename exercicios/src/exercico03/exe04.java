package exercico03;

import java.util.ArrayList;
import java.util.Scanner;

public class exe04 {

	  public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 ArrayList<Integer> lista = new ArrayList<>();

	
	 lista.add(10);
	 lista.add(20);
	 lista.add(30);
	 lista.add(40);
	 lista.add(50);

	System.out.println("Digite um numero para procurar:");
	int num = sc.nextInt();

	boolean achou = false;

	for (int i = 0; i < lista.size(); i++) {
	  if (lista.get(i) == num) {
	 System.out.println("Encontrado no indice: " + i);
	   achou = true;
	  }
	 }

	if (achou == false) {
	 System.out.println("Numero nao encontrado");
	}

	sc.close();
}
}

