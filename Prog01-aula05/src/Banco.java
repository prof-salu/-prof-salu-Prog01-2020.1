
public class Banco {
	public static void main(String[] args) {
		String nomeDoBanco = "Meu bank";

		// Instanciação
		// Construtor --> Conta()
		Conta conta01 = new Conta();
		Conta conta02 = new Conta();
		Conta conta03 = new Conta();

//		System.out.println("Ag: " + conta01.agencia);
//		System.out.println("Numero: " + conta01.numero);
//		System.out.println("Cliente: " + conta01.cliente);
//		System.out.println("Senha: " + conta01.senha);
//		System.out.println("Saldo: R$ " + conta01.saldo);
//		System.out.println("Tipo: " + conta01.tipo);
//		System.out.println();

		// DOT notation (.)
		conta01.agencia = 1234;
		conta01.numero = 7788;
		conta01.cliente = "Gabi";
		conta01.senha = "abc";
		conta01.saldo = 2000;
		conta01.tipo = "Corrente";

		conta02.agencia = 1234;
		conta02.numero = 4567;
		conta02.cliente = "Pedro";
		conta02.senha = "123";
		conta02.saldo = 1000;
		conta02.tipo = "Poupança";

		conta03.agencia = 1234;
		conta03.numero = 4567;
		conta03.cliente = "Pedro";
		conta03.senha = "123";
		conta03.saldo = 1000;
		conta03.tipo = "Poupança";

		// syso + (CTRL + SPACE)
//		System.out.println("Ag: " + conta01.agencia);
//		System.out.println("Numero: " + conta01.numero);
//		System.out.println("Cliente: " + conta01.cliente);
//		System.out.println("Senha: " + conta01.senha);
//		System.out.println("Saldo: R$ " + conta01.saldo);
//		System.out.println("Tipo: " + conta01.tipo);
//		// System.out.printf("Saldo: R$ %.2f", conta01.saldo);
//
//		System.out.println();
//
//		System.out.println("Ag: " + conta02.agencia);
//		System.out.println("Numero: " + conta02.numero);
//		System.out.println("Cliente: " + conta02.cliente);
//		System.out.println("Senha: " + conta02.senha);
//		System.out.println("Saldo: R$ " + conta02.saldo);
//		System.out.println("Tipo: " + conta02.tipo);
//
//		System.out.println();
//
//		System.out.println("Ag: " + conta03.agencia);
//		System.out.println("Numero: " + conta03.numero);
//		System.out.println("Cliente: " + conta03.cliente);
//		System.out.println("Senha: " + conta03.senha);
//		System.out.println("Saldo: R$ " + conta03.saldo);
//		System.out.println("Tipo: " + conta03.tipo);
//
//		System.out.println();
//
//		conta01.saldo = conta01.saldo - 200;
//
//		System.out.println("O saldo conta01 apos o saque: " + conta01.saldo);
//
//		conta02.saldo = conta02.saldo + 200;
//
//		System.out.println("O saldo conta02 apos o deposito: " + conta02.saldo);
//
//		conta02.saldo = conta02.saldo - 500.50;
		
		
		conta01.imprime();
		conta02.imprime();
		conta03.imprime();
		
//		if(conta02.saldo < 50) {
//			System.out.println("Saldo insuficiente");
//		}else {
//			conta02.saldo = conta02.saldo - 50;
//		}
//		System.out.println("Saldo: " + conta02.saldo);
		
		System.out.println("Conta02 saldo: " + conta02.saldo);		
		conta02.saque(100);		
		System.out.println("Conta02 saldo: " + conta02.saldo);
		
		
		System.out.println("Conta01 saldo: " + conta01.saldo);		
		conta01.saque(500);	
		System.out.println("Conta01 saldo: " + conta01.saldo);
		
		
		System.out.println(conta01.deposito(10000));
		System.out.println("Conta01 saldo: " + conta01.saldo);
		
		Conta conta05 = new Conta();
		Conta conta06 = new Conta();
		Conta conta07 = conta05;
		
		conta05.cliente = "Ana";
		conta06.cliente = "Ana";
		
		conta05.saldo = 5000;
		conta06.saldo = 5000;
		
		System.out.println(conta05.cliente == conta06.cliente);
		System.out.println(conta05.saldo == conta06.saldo);
		
		System.out.println(conta05 == conta06);
		System.out.println(conta05 == conta07);
	}
}
