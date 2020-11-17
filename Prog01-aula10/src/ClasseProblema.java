
public class ClasseProblema {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}

	public static void metodo2() {

		System.out.println("Inicio metodo2");
		// try --> catch
		int[] vetor = { 1, 2, 3, 4, 5 };

		for (int i = 0; i <= 5; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println("\nFim metodo2");
	}
}