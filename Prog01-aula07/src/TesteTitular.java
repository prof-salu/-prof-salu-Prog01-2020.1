
public class TesteTitular {
	public static void main(String[] args) {
		
		/*Corrigir os erros da classe*/
		
		//Composicao
		Cliente cl1 = new Cliente("Pedro", "123456789", "Rua Z, 123");
		
//		cl1.nome = "Pedro";
//		cl1.telefone = "123456789";
//		cl1.endereco = "Rua Z, 123";
		
		Conta c1 = new Conta(5678, 1234, 10000, cl1);
//		c1.agencia = 1234;
//		c1.numero = 5678;
//		c1.saldo = 10000;
//		c1.titular = cl1;
		
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Titular: " + c1.getTitular().getNome());
		
		
		//c1.getTitular().setEndereco("Avenida Y, 67");
		cl1.setEndereco("Avenida Y, 67");
		
		System.out.println("Endereco: " + cl1.getEndereco());
		
	}
}
