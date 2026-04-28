package exercicio04;
class Funcionario {
    int identificacao;
    String nome;
    String sobrenome;
    double salarioMensal;

    public Funcionario(int identificacao, String nome, String sobrenome, double salarioMensal) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double obterSalarioAnual() {
        return salarioMensal * 12;
    }

    public String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public void aumentarSalario(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }
}

public class ex05 {

	 public static void main(String[] args) {

	        Funcionario f1 = new Funcionario(1, "João", "Silva", 3000.0);

	        System.out.println("Nome completo: " + f1.obterNomeCompleto());
	        System.out.println("Salário anual: " + f1.obterSalarioAnual());

	        f1.aumentarSalario(10);

	        System.out.println("Novo salário mensal: " + f1.salarioMensal);
	        System.out.println("Novo salário anual: " + f1.obterSalarioAnual());
	    }
}
