package exercico04;

public class exe04 {
	
	 private String marca;
	    private String modelo;
	    private double preco;
	    private int quantidadeEstoque;

	    public exe04 (String marca, String modelo, double preco, int quantidadeEstoque) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.preco = preco;
	        this.quantidadeEstoque = quantidadeEstoque;
	    }


public void adicionarEstoque(int quantidade) {
    if (quantidade > 0) {
        quantidadeEstoque += quantidade;
    }
}

public boolean vender(int quantidade) {
    if (quantidade <= quantidadeEstoque) {
        quantidadeEstoque -= quantidade;
        return true;
    } else {
        System.out.println("Estoque insuficiente!");
        return false;
    }
}
public String getMarca() {
    return marca;
}

public String getModelo() {
    return modelo;
}

public double getPreco() {
    return preco;
}

public int getQuantidadeEstoque() {
    return quantidadeEstoque;
}

@Override
public String toString() {
    return marca + " - " + modelo + " | R$" + preco + " | Estoque: " + quantidadeEstoque;
}
}


