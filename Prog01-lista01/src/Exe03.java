import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// Fa�a um programa que:
		// - Leia a cota��o do d�lar
		// - Leia um valor em d�lares
		// - Converta esse valor para Real
		// - Mostre o resultado
		
		Scanner entrada = new Scanner(System.in);
		double cotacaoDolar;
		double valorDolar;
		double valorReal;
		
		System.out.println("Informe a cota��o do dia: ");
		cotacaoDolar = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de Dolares: ");
		valorDolar = entrada.nextDouble();
		
		entrada.close();
		
		valorReal = cotacaoDolar * valorDolar;
		
		//O valor US$ ??? convertido em Reais � de R$ ????
		
		System.out.printf("O valor US$ %.2f convertido em Reais � de R$ %.2f", valorDolar, valorReal);		

	}

}
