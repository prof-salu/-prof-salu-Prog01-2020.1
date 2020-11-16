
public class ContaCorrente extends Conta implements Imprimivel{
	private double taxaDeOperacao;
	
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}
	
	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}	
	
	@Override
	public boolean sacar(double valor) {
		if(valor > 0 && valor < getSaldo()) {
			saldo -= valor + taxaDeOperacao;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean depositar(double valor) {
		return super.depositar(valor - taxaDeOperacao);
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Numero: " + getNumeroConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Taxa: " + getTaxaDeOperacao());		
	}
}
