package produtos;

public class calcularProduto {

	public static void main(String[] args) {
		
		produtos p1 = new produtos ();
		
		p1.nome = "caderno";
		p1.descricao ="Caderno em espiral tamanho médio";
	    p1.precoUni = 4.50;
	    p1.desconto = 15;
	    
	    produtos p2 = new produtos ();

	    p2.nome = " caneta esf";
	    p2.descricao ="Caneta esferográfica 5mm";
	    p2.precoUni = 1.20;
	    p2.desconto = 2;
	    
	    produtos p3 = new produtos ();
	    
	    p3.nome = "Esquadro";
	    p3.descricao ="Esquadro de acrílico 20 cm";
	    p3.precoUni =  2.35;
	    p3.desconto = 10;
	}

}
