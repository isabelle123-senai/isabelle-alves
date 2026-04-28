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

	 public static void main(String[] args) {

	        Aeronave[] aeronaves = new Aeronave[4];

	        aeronaves[0] = new Aeronave();
	        aeronaves[0].modelo = "A320";
	        aeronaves[0].passageiros = 180;
	        aeronaves[0].velocidadeMaxima = 840;
	        aeronaves[0].capacidadeCombustivel = 23800;
	        aeronaves[0].queimaCombustivelPorMinuto = 50;

	        aeronaves[1] = new Aeronave();
	        aeronaves[1].modelo = "Boeing 737";
	        aeronaves[1].passageiros = 215;
	        aeronaves[1].velocidadeMaxima = 850;
	        aeronaves[1].capacidadeCombustivel = 26000;
	        aeronaves[1].queimaCombustivelPorMinuto = 55;

	        aeronaves[2] = new Aeronave();
	        aeronaves[2].modelo = "Embraer E195";
	        aeronaves[2].passageiros = 132;
	        aeronaves[2].velocidadeMaxima = 870;
	        aeronaves[2].capacidadeCombustivel = 18000;
	        aeronaves[2].queimaCombustivelPorMinuto = 40;

	        aeronaves[3] = new Aeronave();
	        aeronaves[3].modelo = "Airbus A330";
	        aeronaves[3].passageiros = 277;
	        aeronaves[3].velocidadeMaxima = 880;
	        aeronaves[3].capacidadeCombustivel = 97000;
	        aeronaves[3].queimaCombustivelPorMinuto = 120;

	        int maiorPassageiros = 0;

	        for (int i = 1; i < aeronaves.length; i++) {
	            if (aeronaves[i].passageiros > aeronaves[maiorPassageiros].passageiros) {
	                maiorPassageiros = i;
	            }
	        }

	        int maisTempoAr = 0;

	        for (int i = 1; i < aeronaves.length; i++) {
	            if (aeronaves[i].tempoMaximoVoo() > aeronaves[maisTempoAr].tempoMaximoVoo()) {
	                maisTempoAr = i;
	            }
	        }

	        int maiorAlcance = 0;

	        for (int i = 1; i < aeronaves.length; i++) {
	            if (aeronaves[i].alcanceMaximo() > aeronaves[maiorAlcance].alcanceMaximo()) {
	                maiorAlcance = i;
	            }
	        }

	        System.out.println("a) Maior número de passageiros: " + aeronaves[maiorPassageiros].modelo);
	        System.out.println("b) Maior tempo no ar: " + aeronaves[maisTempoAr].modelo);
	        System.out.println("c) Maior alcance: " + aeronaves[maiorAlcance].modelo);
	    }
	}

