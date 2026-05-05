package exercico04;

public class exe04alunos {

	 public static void main(String[] args) {

	        MateriaisDeConstrucao loja = new MateriaisDeConstrucao();

	        exe04 p1 = new exe04("Votoran", "Cimento CP II", 35.0, 100);
	       exe04 p2 = new exe04("Votoran", "Cimento CP III", 40.0, 50);
	       exe04 p3 = new exe04("Amanco", "Tubo PVC 100mm", 80.0, 30);

	        loja.adicionarProduto(p1);
	        loja.adicionarProduto(p2);
	        loja.adicionarProduto(p3);

	       
	        p1.vender(10);

	       
	        exe04 maisCaro = loja.produtoMaisCaroPorMarca("Votoran");
	        System.out.println("Mais caro: " + maisCaro);

	       
	        System.out.println("Produtos entre 30 e 50:");
	        for (exe04 p : loja.produtosPorMarcaEPreco("Votoran", 30, 50)) {
	            System.out.println(p);
	        }
	    }
}
