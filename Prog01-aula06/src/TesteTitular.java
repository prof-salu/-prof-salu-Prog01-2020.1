
public class TesteTitular {
	public static void main(String[] args) {
		//Composicao
		Cliente cl1 = new Cliente();
		
		cl1.nome = "Pedro";
		cl1.telefone = "123456789";
		cl1.endereco = "Rua Z, 123";
		
		Conta c1 = new Conta();
		c1.agencia = 1234;
		c1.numero = 5678;
		c1.saldo = 10000;
		c1.titular = cl1;
		
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Titular: " + c1.titular.nome);
	}
}
