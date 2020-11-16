
public class ContaPoupanca extends Conta implements Imprimivel{

	private double limite;
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor > 0 && valor < (getSaldo() + limite)) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Numero: " + getNumeroConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Saldo com limite: " + (getSaldo() + getLimite()));		
	}
}
