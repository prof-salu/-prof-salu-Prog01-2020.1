import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		/*Escreva um programa que leia um n�mero inteiro. 
		 * Verificar por meio de condi��o se o valor fornecido est� na faixa 
		 * entre 0 (zero) e 9 (nove). 
		 * Caso o valor fornecido esteja dentro da faixa, 
		 * apresentar a mensagem �valor v�lido�. 
		 * Caso contr�rio, apresentar a mensagem �valor inv�lido�.*/

		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		teclado.close();
		if(numero >= 0 && numero <= 9) {
			System.out.println("Valor valido");
		}else {
			System.out.println("Valor invalido");
		}
	}
}
