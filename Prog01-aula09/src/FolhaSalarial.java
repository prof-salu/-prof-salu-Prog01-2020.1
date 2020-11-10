
public class FolhaSalarial {
	
	private double totalPago = 0;
	
	public double getTotalPago() {
		return totalPago;
	}
	
//	public void adicionarFolha(Funcionario funcionario) {
//		totalPago = totalPago + funcionario.calcularSalario();
//	}
	
	//Sobrecarga --> overload
//	public void adicionarFolha(Vendedor vendedor) {
//		totalPago = totalPago + vendedor.calcularSalario();
//	}
	
//	public void adicionarFolha(Motorista motorista) {
//		totalPago = totalPago + motorista.calcularSalario();
//	}

	public void adicionarFolha(IFolha funcionario) {
		totalPago = totalPago + funcionario.calcularSalario();
	}
	
	public void adicionarFolha(IFolha funcionario, int numFilhos) {
		totalPago = totalPago + funcionario.calcularSalario();
	}
}