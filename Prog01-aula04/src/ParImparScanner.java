import java.util.Scanner;

public class ParImparScanner {
	public static void main(String[] args) {
		int numero = 7;
		Scanner teclado = new Scanner(System.in);
			
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Informe um numero: ");
			numero = teclado.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
		}	
		
		teclado.close();		
	}
}
