
public class TesteTotalDeContas {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana", "1234", "Rua b");
		Conta cc1 = new Conta(1234, 5678, 1000, cliente);
		//System.out.println("Total de contas: " + cc1.getTotalDeContas());
		Conta cc2 = new Conta(1235, 5678, 1000, cliente);
		//System.out.println("Total de contas: " + cc1.getTotalDeContas());
		Conta cc3 = new Conta(1236, 5678, 1000, cliente);
		//System.out.println("Total de contas: " + cc3.getTotalDeContas());
			
		//Quantas contas foram criadas no banco?
		System.out.println("Total de contas: " + Conta.getTotalDeContas());		
	}

}
