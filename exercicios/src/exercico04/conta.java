package exercico04;

public class conta {
	
	 private String nomeTitular;
	    private double saldo;

	    public conta(String nomeTitular, double saldoInicial) {
	        this.nomeTitular = nomeTitular;
	        this.saldo = saldoInicial;
	    }

	   
	    public void sacar(double valor) {
	        if (valor <= 0) {
	            System.out.println("Valor inválido para saque.");
	        } else if (valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque realizado com sucesso!");
	        } else {
	            System.out.println("Saldo insuficiente!");
	        }
	    }

	    
	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito realizado com sucesso!");
	        } else {
	            System.out.println("Valor inválido para depósito.");
	        }
	    }

	    
	    public void transferir(conta destino, double valor) {
	        if (valor <= 0) {
	            System.out.println("Valor inválido para transferência.");
	        } else if (valor <= saldo) {
	            this.saldo -= valor;
	            destino.saldo += valor;
	            System.out.println("Transferência realizada com sucesso!");
	        } else {
	            System.out.println("Saldo insuficiente para transferência!");
	        }
	    }

	    public double simularInvestimento(double valor, int meses) {
	        double taxa = 0.01;

	        return valor * Math.pow(1 + taxa, meses);
	    }

	    public String getNomeTitular() {
	        return nomeTitular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }
	}

