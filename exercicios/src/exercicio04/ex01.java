package exercicio04;

class Pessoa {
    String nome;
    char sexo;
    String dataNascimento;
    String estadoCivil;

    public Pessoa(String nome, char sexo, String dataNascimento, String estadoCivil) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }
}

public class ex01 {

    public static void main(String[] args) {

       
        Pessoa p1 = new Pessoa("Ana Silva", 'F', "10/05/2000", "Solteira");
        Pessoa p2 = new Pessoa("Carlos Souza", 'M', "22/08/1995", "Casado");


        System.out.println("Pessoa 1:");
        System.out.println(p1.nome + " - " + p1.sexo + " - " + p1.dataNascimento + " - " + p1.estadoCivil);

        System.out.println("\nPessoa 2:");
        System.out.println(p2.nome + " - " + p2.sexo + " - " + p2.dataNascimento + " - " + p2.estadoCivil);
    }
}
