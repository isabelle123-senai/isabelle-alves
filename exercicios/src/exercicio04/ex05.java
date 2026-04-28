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

}
