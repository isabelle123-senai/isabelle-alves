package exercicios;

public class Exemplo {

	public static void main(String[] args) {
		
	Veiculo01 v1 = new Veiculo01();
	
	v1.modelo = "Honda City";
    v1.comprimento= 4.2;
    v1.passageiro = 5;
    v1.velMax = 190;
    v1.cor = "vermelho";
    
    Veiculo01 v2 = new Veiculo01();
    
    v2.modelo = " palho";
    v2.comprimento= 3.2;
    v2.passageiro = 5;
    v2.velMax = 170;
    v2.cor = "verde";
    
    if (v1.velMax> v2.velMax) {
    	 System.out.println ("o"+v1.modelo+"é mais rapido ");
    } else {
    	System.out.println("o"+ v2.modelo+ "é mais rapido");
    }
    
    
	}

}
