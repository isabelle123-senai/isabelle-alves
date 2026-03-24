package mercado;

public class mercado {

	String nome;
	double nmrMaca;
	double preçoMa;
	int nmrLara;
	double preçoLara;
		
	 public double obterReceitaMacas() {
	        return nmrMaca * preçoMa;
	    }
	     
	    public double obterReceitaLaranjas() {
	        return nmrLara * preçoLara;
	    }

	    public double obterReceitaTotal() {
	        return obterReceitaLaranjas() + obterReceitaMacas();
	    }


	}

