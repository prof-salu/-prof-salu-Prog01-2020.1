
public class TestaConta {
	public static void main(String[] args) {
		double taxa = 0.5;
		
		//Instanciando uma conta
		Conta c1 = new Conta();
		
		c1.agencia = 1234;
		c1.numero = 5678;
		c1.saldo = 7000;
		c1.titular = "Pedro";
		
		System.out.println("Saldo: " + c1.saldo);		
		//Saque de 200
		//c1.saldo = c1.saldo - 200 - taxa;
		
		System.out.println("Saque efetuado? " + c1.saca(200));
		System.out.println("Saldo: " + c1.saldo);
		//c1.saldo = c1.saldo - 500 - taxa;
		c1.saca(500);
		System.out.println("Saldo: " + c1.saldo);
		//c1.saldo = c1.saldo - 1000 - taxa ;
		System.out.println("Saque efetuado? " + c1.saca(-5000));
		System.out.println("Saldo: " + c1.saldo);
		
		System.out.println("Saque efetuado? " + c1.saca(15000));
		System.out.println("Saldo: " + c1.saldo);
	}
}
