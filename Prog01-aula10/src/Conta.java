
public abstract class Conta {
	private int numeroConta;
	
	// BigDecimal
	protected double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract boolean sacar(double valor);
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta favorecido) {
		if(sacar(valor) == true) {
			favorecido.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
}