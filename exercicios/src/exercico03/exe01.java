package exercico03;

import java.util.ArrayList;
import java.util.Collections;

public class exe01 {
	 public static void main(String[] args) {
		 
	 ArrayList<Integer> lista = new ArrayList<>();

     lista.add(5);
     lista.add(2);
     lista.add(9);
     lista.add(1);
     lista.add(3);

     Collections.sort(lista);

     System.out.println("Lista ordenada: " + lista);
}
}
