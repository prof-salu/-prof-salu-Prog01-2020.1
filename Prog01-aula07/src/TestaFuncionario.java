
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1234, "Pedro", 3000, "pedro@email.com");
		Funcionario f2 = new Funcionario(1235, "Ana", 4000, "ana@email.com");
		Funcionario f3 = new Funcionario(1236, "Clara", 3500, "clara@email.com");
//		Funcionario f4 = new Funcionario(1236, "Clara", 3500, "clara@email.com");
//		Funcionario f5 = new Funcionario(1236, "Clara", 3500, "clara@email.com");
//		Funcionario f6 = new Funcionario(1236, "Clara", 3500, "clara@email.com");
//		Funcionario f7 = new Funcionario(1236, "Clara", 3500, "clara@email.com");
		
		System.out.println("Total de funcionario criados: " + Funcionario.getTotalFuncionarios());
		
		System.out.println(f1.calcularAumento(0.3));
	}

}
