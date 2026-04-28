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
public class mercado {

}
