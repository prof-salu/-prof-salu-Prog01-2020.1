
public class Exe05 {

	public static void main(String[] args) {
		// Escreva um programa que imprima na tela a soma dos n�meros �mpares 
		// entre 0 e 30 e a multiplica��o dos n�meros pares entre 0 e 30.
		
		int somaImpar = 0;
		long multPar = 1;
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 != 0) {
				somaImpar = somaImpar + i;
			}else {
				multPar = multPar * i;
			}
		}
		
		System.out.println("Soma dos impares: " + somaImpar);
		System.out.println("Multiplica��o dos pares: " + multPar);
		
		
	}

}
