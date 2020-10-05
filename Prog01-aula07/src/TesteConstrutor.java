
public class TesteConstrutor {

	public static void main(String[] args) {
		/*Corrigir os erros da classe*/
		
		Cliente cl1 = new Cliente("Ana", "12345678", "Rua XYZ, 11");
		
		Conta c1 = new Conta(1234, 5678, 5000, cl1);
		//Conta c2 = new Conta();
		
		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Numero: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		//System.out.println("Titular: " + c1.titular.nome);
		
		
		//Encapsulamento
		
		c1.saca(100);
		System.out.println("Saldo: " + c1.getSaldo());
		//c1.saldo = c1.getSaldo() - 1000;
		System.out.println("Saldo: " + c1.getSaldo());	
		
		c1.setAgencia(9987);
		
		System.out.println("Agencia: " + c1.getAgencia());
		//System.out.println("Numero: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		
		//c1.setSaldo(50000);
		
		System.out.println("Agencia: " + c1.getAgencia());
		//System.out.println("Numero: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		
	}

}
