package dados;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
	public ContaCorrente(int agencia, int numero, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	public void tranferir() {
		
	}
}
