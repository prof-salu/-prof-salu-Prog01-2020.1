import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		// Escreva um programa que leia um n�mero inteiro (vari�vel CODIGO). 
		// Verificar se o c�digo � igual a 1, igual a 2 ou igual a 3. 
		// Caso n�o seja, apresentar a mensagem �C�digo inv�lido�. 
		// Ao ser verificado o c�digo e constatado que � um valor v�lido,
		// o programa deve verificar cada c�digo em separado para determinar seu valor 
		// por extenso, ou seja, apresentar a mensagem �um�, �dois� ou �tr�s�.
		
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;
		
		System.out.println("Informe o codigo: ");
		codigo = teclado.nextInt();
		teclado.close();
		switch(codigo) {
			case 1:
				System.out.println("UM");
				break;
			case 2:
				System.out.println("DOIS");
				break;
			case 3:
				System.out.println("TR�S");
				break;
			default:
				System.out.println("CODIGO INVALIDO");
		}
		

	}

}
