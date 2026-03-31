package aeronave;

public class aeronave {

	String modelo;
	int passageiro;
	 double velmax;
	 double capcombustivel;
	 double consumo;
	 
	 public double calcularAutonomia() {
		 return capcombustivel / consumo;
		 
	 }
	 public aeronave (String modelo, int passageiro,double velmax, double capcombustivel, double consumo) {
	 super();
	 
	 this.modelo = modelo;
	 this.passageiro = passageiro;
     this.velmax = velmax;
	 this.capcombustivel = capcombustivel;
	 this.consumo = consumo;
	 
	 public double calcularDistancia() {
		    return velmax * calcularAutonomia();
		}
}
	 
	 

