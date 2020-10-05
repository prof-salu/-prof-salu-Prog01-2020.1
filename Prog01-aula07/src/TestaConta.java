
public class TestaConta {
	public static void main(String[] args) {
		
		/*Corrigir os erros da classe*/
		
		double taxa = 0.5;
		
		Cliente cli1 = new Cliente("Pedro", "12345", "Rua ABC, 12");
		Cliente cli2 = new Cliente("Cintia", "98765", "Rua BCDE, 11");
		
		//Instanciando uma conta
		Conta c1 = new Conta(5678, 1234, 7000, cli1);
		Conta c2 = new Conta(7788, 1234, 1000, cli2);
		
		cli1.setTelefone("912345678");
		cli2.setTelefone("989898987");
		
		System.out.println("Saldo: " + c1.getSaldo());		
		//Saque de 200
		//c1.saldo = c1.saldo - 200 - taxa;
		
		System.out.println("Saque efetuado? " + c1.saca(200));
		System.out.println("Saldo: " + c1.getSaldo());
		//c1.saldo = c1.saldo - 500 - taxa;
		c1.saca(500);
		System.out.println("Saldo: " + c1.getSaldo());
		//c1.saldo = c1.saldo - 1000 - taxa ;
		System.out.println("Saque efetuado? " + c1.saca(-5000));
		System.out.println("Saldo: " + c1.getSaldo());
		
		System.out.println("Saque efetuado? " + c1.saca(15000));
		System.out.println("Saldo: " + c1.getSaldo());
		
		c1.deposita(800);
		System.out.println("Saldo: " + c1.getSaldo());
		
		c1.deposita(-2000);
		System.out.println("Saldo: " + c1.getSaldo());
		
		//Transferir 500 reais de C1 para C2
		System.out.println("Antes da transferencia");
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo: " + c2.getSaldo());
		c1.transfere(500, c2);
		System.out.println("Apos a transferencia");
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo: " + c2.getSaldo());
	}
}