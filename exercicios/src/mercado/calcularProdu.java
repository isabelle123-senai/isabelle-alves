package mercado;

import mercado.mercado;

public class calcularProdu {

	public static void main(String[] args) {
		
		mercado m1 = new mercado();
		
		m1.nome = "unidadeDeBlumenau";
		m1.nmrMaca = 100;
		m1.preçoMa =  4.00;
		m1.nmrLara = 200;
		m1.preçoLara = 2.00;
		
       mercado m2 = new mercado();
		
		m2.nome = "unidadeDeJoinville";
		m2.nmrMaca = 200;
		m2.preçoMa =  5.00;
		m2.nmrLara = 300;
		m2.preçoLara = 4.00;
		
		  mercado m3 = new mercado();
			
			m3.nome = "unidadeDeFlorianopolis";
			m3.nmrMaca = 400;
			m3.preçoMa =  10.00;
			m3.nmrLara = 800;
			m3.preçoLara = 1.00;
			
			mercado listaMercados[] = { m1, m2, m3 };

			
			double maiorReceitaMacas = 0;
			mercado mercadoMaiorReceitaMacas = null;

			for (int i = 0; i < listaMercados.length; i++) {
				if (listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
					maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
					mercadoMaiorReceitaMacas = listaMercados[i];
				}
			}

			System.out.println(mercadoMaiorReceitaMacas.nome);

		

			double menorReceitaLaranjas = Double.MAX_VALUE;
			mercado mercadoMenorReceitaLaranjas = null;

			for (int i = 0; i < listaMercados.length; i++) {
				if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
					menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
					mercadoMenorReceitaLaranjas = listaMercados[i];
				}
			}

			System.out.println(mercadoMenorReceitaLaranjas.nome);
			
			

		}

	}


