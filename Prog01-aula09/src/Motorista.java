
public class Motorista extends Funcionario implements IFolha, IImprimivel{
	private double valorHora;
	private int totalHoras;

	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
	
	@Override
	public double calcularSalario() {
		return valorHora * totalHoras;
	}
	
	@Override
	public void exibeInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Salario: " + calcularSalario());
		
	}
}
