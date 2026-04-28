package exercicio04;
class Aeronave {
    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelPorMinuto;

    double tempoMaximoVoo() {
        return capacidadeCombustivel / queimaCombustivelPorMinuto;
    }

    double alcanceMaximo() {
        return tempoMaximoVoo() * velocidadeMaxima;
    }
}

public class aeronave {

	
}
