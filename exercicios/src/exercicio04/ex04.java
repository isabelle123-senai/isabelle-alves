package exercicio04;
class Circulo {
    double raio;

    
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
public class ex04 {

	 public static void main(String[] args) {

	         Circulo c1 = new Circulo();
	        Circulo c2 = new Circulo();
	        Circulo c3 = new Circulo();
	        Circulo c4 = new Circulo();

	      
	        c1.raio = 2;
	        c2.raio = 3.5;
	        c3.raio = 5;
	        c4.raio = 7.2;

	      
	        System.out.println("Área do círculo 1: " + c1.calcularArea());
	        System.out.println("Área do círculo 2: " + c2.calcularArea());
	        System.out.println("Área do círculo 3: " + c3.calcularArea());
	        System.out.println("Área do círculo 4: " + c4.calcularArea());
	    }
}
