package exercico03;

import java.util.ArrayList;
import java.util.Scanner;

public class exe03 {

	  public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	ArrayList<Double> lista = new ArrayList<>();

	double num;

	System.out.println("Digite numeros (0 para parar):");

	num = sc.nextDouble();

	while (num != 0) {
    lista.add(num);
	 num = sc.nextDouble();
	}

	if (lista.size() > 0) {

	 double menor = lista.get(0);
     double maior = lista.get(0);
     double soma = 0;

	for (int i = 0; i < lista.size(); i++) {
	if (lista.get(i) < menor) {
	    menor = lista.get(i);
	 }

	if (lista.get(i) > maior) {
	maior = lista.get(i);
	}

	 soma = soma + lista.get(i);
	}

	double media = soma / lista.size();

	  System.out.println("Menor: " + menor);
	 System.out.println("Maior: " + maior);
	 System.out.println("Media: " + media);

	} else {
	System.out.println("Nenhum numero foi digitado");
	}

	sc.close();
}
}

