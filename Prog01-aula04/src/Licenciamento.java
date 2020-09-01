import java.util.Scanner;

public class Licenciamento {
	// ECLIPSE ==> main + CTRL + SPACE --> public static void main(String[] args) {}
	// NETBEANS ==> psvm + TAB --> public static void main(String[] args) {}

	public static void main(String[] args) {
		/*
		 * Final da placa 0 - 3 ==> Renovacao em Janeiro 4 ==> Renovacao em Fevereiro 5
		 * - 6 ==> Renovacao em Marco 7 - 9 ==> Renovacao em Abril valor diferente ==>
		 * ERROR
		 */

		int placa;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o final da placa: ");
		placa = entrada.nextInt();

		switch (placa) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("Janeiro");
				break;
			case 4:
				System.out.println("Fevereiro");
				break;
			case 5:
			case 6:
				System.out.println("Marco");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Abril");
				break;
			default:
				System.out.println("Valor invalido");
		}
	}
}
