package Retangulo01;

public class retangulo {

	private double altura;

	private double largura;

	public retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}

	
	public double obterArea() {
		return largura * altura;
	}

	
	public double obterPerimetro() {
		return (largura + altura) * 2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura <= 0) {
			throw new IllegalArgumentException("Largura inválida");
		}
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
}
}

