import java.util.Scanner;

public class TestaSaque {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 1000;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser sacado: ");
		
		double valorSaque = teclado.nextDouble();
		
		c1.saque(valorSaque);
		
		System.out.println("Saldo: " + c1.saldo);
		
		teclado.close();
	}
}
