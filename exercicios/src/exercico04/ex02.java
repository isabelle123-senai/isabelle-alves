package exercico04;

import java.util.ArrayList;
import java.util.List;

class VendaFlor {
    String nomeFlor;
    double preco;
    String nomeCliente;

    public VendaFlor(String nomeFlor, double preco, String nomeCliente) {
        this.nomeFlor = nomeFlor;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
    }
}


public class ex02 {

    private List<VendaFlor> vendas = new ArrayList<>();

   
    public void adicionarVenda(String nomeFlor, double preco, String nomeCliente) {
        vendas.add(new VendaFlor(nomeFlor, preco, nomeCliente));
    }

    public List<String> buscarFloresPorCliente(String nomeCliente) {
        List<String> floresCompradas = new ArrayList<>();

        for (VendaFlor venda : vendas) {
            if (venda.nomeCliente.equalsIgnoreCase(nomeCliente)) {
                floresCompradas.add(venda.nomeFlor);
            }
        }

        return floresCompradas;
    }

    public static void main(String[] args) {
        ex02 sistema = new ex02();

        sistema.adicionarVenda("Rosa", 10.0, "Maria");
        sistema.adicionarVenda("Tulipa", 12.0, "João");
        sistema.adicionarVenda("Orquídea", 25.0, "Maria");

        List<String> resultado = sistema.buscarFloresPorCliente("Maria");

        System.out.println("Flores compradas por Maria: " + resultado);
    }
	
}
