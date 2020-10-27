package empresa;

public class Vendedor extends Funcionario{
	private double comissao;
	private double totalVendas;
		
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	//Reescrita (Override)
	
	@Override
	public double calculaBonificacao() {
		return super.calculaBonificacao() + (comissao * totalVendas);
	}
	
}
