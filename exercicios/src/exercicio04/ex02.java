package exercicio04;
 
class Mercado {
    String nomeMercado;
    int numMacasVendidasAno;
    double precoMaca;
    int numLaranjasVendidasAno;
    double precoLaranja;
}

public class ex02 {

	 public static void main(String[] args) {

	        
	        Mercado unidadeDeBlumenau = new Mercado();
	        Mercado unidadeDeJoinville = new Mercado();
	        Mercado unidadeDeFlorianopolis = new Mercado();

	    
	        unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
	        unidadeDeBlumenau.numMacasVendidasAno = 10000;
	        unidadeDeBlumenau.precoMaca = 2.50;
	        unidadeDeBlumenau.numLaranjasVendidasAno = 8000;
	        unidadeDeBlumenau.precoLaranja = 1.80;

	        
	        unidadeDeJoinville.nomeMercado = "Mercado Joinville";
	        unidadeDeJoinville.numMacasVendidasAno = 12000;
	        unidadeDeJoinville.precoMaca = 2.30;
	        unidadeDeJoinville.numLaranjasVendidasAno = 9000;
	        unidadeDeJoinville.precoLaranja = 1.70;

	      
	        unidadeDeFlorianopolis.nomeMercado = "Mercado Florianópolis";
	        unidadeDeFlorianopolis.numMacasVendidasAno = 15000;
	        unidadeDeFlorianopolis.precoMaca = 2.80;
	        unidadeDeFlorianopolis.numLaranjasVendidasAno = 11000;
	        unidadeDeFlorianopolis.precoLaranja = 2.00;

	       
	        System.out.println(unidadeDeBlumenau.nomeMercado);
	        System.out.println(unidadeDeJoinville.nomeMercado);
	        System.out.println(unidadeDeFlorianopolis.nomeMercado);
	    }
}
