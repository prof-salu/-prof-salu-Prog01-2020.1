
public class TesteConstrutor {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		
		Conta c1 = new Conta(1234, 5678, 5000, cl1);
		//Conta c2 = new Conta();
		
		System.out.println("Agencia: " + c1.agencia);
		System.out.println("Numero: " + c1.numero);
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Titular: " + c1.titular.nome);
		
	}

}
