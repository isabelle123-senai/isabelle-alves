package exercico03;

import java.util.ArrayList;
import java.util.Collections;

public class exercico02 {

	 public static void main(String[] args) {

	        ArrayList<Integer> lista = new ArrayList<>();

	      
	        lista.add(1);
	        lista.add(2);
	        lista.add(3);
	        lista.add(4);
	        lista.add(5);

	       
	        Collections.reverse(lista);

	     
	        System.out.println("Lista invertida: " + lista);
}
}
