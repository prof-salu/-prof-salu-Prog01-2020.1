import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia;
		//Eclipse
		// syso + CTRL + SPACE --> System.out.println();
		
		//Netbeans
		//sout + TAB --> System.out.println();
		
		System.out.println("Informe o dia da semana: ");
		dia = teclado.nextInt();
		
//		if(dia == 1) {
//			System.out.println("Domingo");
//		}else if(dia == 2) {
//			System.out.println("Segunda");
//		}else if(dia == 3) {
//			System.out.println("Terca");
//		}else if(dia == 4) {
//			System.out.println("Quarta");
//		}else if(dia == 5) {
//			System.out.println("Quinta");
//		}else if(dia == 6) {
//			System.out.println("Sexta");
//		}else if(dia == 7) {
//			System.out.println("Sabado");
//		}else {
//			System.out.println("Dia invalido");
//		}	
		
		switch(dia) {
			case 1: 
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terca");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Dia invalido");
		}
	}
}
