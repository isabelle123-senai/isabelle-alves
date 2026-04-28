package exercicio04;

class Mercado {
    String nomeMercado;
    int numMacasVendidasAno;
    double precoMaca;
    int numLaranjasVendidasAno;
    double precoLaranja;

    double receitaMacas() {
        return numMacasVendidasAno * precoMaca;
    }

    double receitaLaranjas() {
        return numLaranjasVendidasAno * precoLaranja;
    }

    double receitaTotal() {
        return receitaMacas() + receitaLaranjas();
    }
}
public class ex06 {

	  public static void main(String[] args) {

	        Mercado[] mercados = new Mercado[3];

	        mercados[0] = new Mercado();
	        mercados[0].nomeMercado = "Blumenau";
	        mercados[0].numMacasVendidasAno = 10000;
	        mercados[0].precoMaca = 2.50;
	        mercados[0].numLaranjasVendidasAno = 8000;
	        mercados[0].precoLaranja = 1.80;

	        mercados[1] = new Mercado();
	        mercados[1].nomeMercado = "Joinville";
	        mercados[1].numMacasVendidasAno = 12000;
	        mercados[1].precoMaca = 2.30;
	        mercados[1].numLaranjasVendidasAno = 9000;
	        mercados[1].precoLaranja = 1.70;

	        mercados[2] = new Mercado();
	        mercados[2].nomeMercado = "Florianópolis";
	        mercados[2].numMacasVendidasAno = 15000;
	        mercados[2].precoMaca = 2.80;
	        mercados[2].numLaranjasVendidasAno = 11000;
	        mercados[2].precoLaranja = 2.00;

	        int maiorMacas = 0;
	        int menorLaranjas = 0;

	        for (int i = 1; i < mercados.length; i++) {
	            if (mercados[i].receitaMacas() > mercados[maiorMacas].receitaMacas()) {
	                maiorMacas = i;
	            }

	            if (mercados[i].receitaLaranjas() < mercados[menorLaranjas].receitaLaranjas()) {
	                menorLaranjas = i;
	            }
	        }

	        double[] receitas = new double[3];
	        for (int i = 0; i < mercados.length; i++) {
	            receitas[i] = mercados[i].receitaTotal();
	        }

	        int primeiro = 0, segundo = 0;

	        for (int i = 1; i < receitas.length; i++) {
	            if (receitas[i] > receitas[primeiro]) {
	                segundo = primeiro;
	                primeiro = i;
	            } else if (receitas[i] > receitas[segundo]) {
	                segundo = i;
	            }
	        }

	        double totalMacas = 0;
	        double totalLaranjas = 0;

	        for (int i = 0; i < mercados.length; i++) {
	            totalMacas += mercados[i].receitaMacas();
	            totalLaranjas += mercados[i].receitaLaranjas();
	        }

	        System.out.println("a) Maior receita de maçãs: " + mercados[maiorMacas].nomeMercado);
	        System.out.println("b) Menor receita de laranjas: " + mercados[menorLaranjas].nomeMercado);
	        System.out.println("c) Segunda maior receita total: " + mercados[segundo].nomeMercado);

	        if (totalMacas > totalLaranjas) {
	            System.out.println("d) Maior receita: Maçãs");
	        } else if (totalLaranjas > totalMacas) {
	            System.out.println("d) Maior receita: Laranjas");
	        } else {
	            System.out.println("d) Receitas iguais");
	        }
	    }
}
