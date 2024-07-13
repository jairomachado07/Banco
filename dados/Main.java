package dados;

public class Main {

	public static void main(String[] args) {
		Cliente jairo = new Cliente();
		jairo.setNome("Jairo Machado");
		
		Conta cc = new ContaCorrente(jairo);
		cc.depositar(225);
		Conta poupanca = new ContaPoupanca(jairo);
		cc.tranferir(200, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
