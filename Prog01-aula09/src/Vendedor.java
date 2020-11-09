
public class Vendedor extends Mensalista{
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
	
	@Override
	public double calcularSalario() {
		return getSalario() + (getComissao() * getTotalVendas());
	}	
}
