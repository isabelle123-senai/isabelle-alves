package exercico04;

import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

	private List<exe04> produtos = new ArrayList<>();

    public void adicionarProduto(exe04 produto) {
        produtos.add(produto);
    }
    public exe04 produtoMaisCaroPorMarca(String marca) {
        exe04 maisCaro = null;

        for (exe04 p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    public List<exe04> produtosPorMarcaEPreco(String marca, double min, double max) {
        List<exe04> resultado = new ArrayList<>();

        for (exe04 p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca) &&
                p.getPreco() >= min && p.getPreco() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
