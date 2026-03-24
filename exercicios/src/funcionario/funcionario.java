package funcionario;


	public class funcionario {

		String identificacao;
		String nome;
		String sobrenome;
		double salario;

	
		public double obterSalarioAnual() {
			return salario * 12;
		}

		
		public String obterNomeCompleto() {
			return nome + " " + sobrenome;
		}

		public void modificarSalario(double percentualAumento) {
			double aumento = salario * percentualAumento / 100;
			double salarioFinal = salario + aumento;
			salario = salarioFinal;
		}

	}

