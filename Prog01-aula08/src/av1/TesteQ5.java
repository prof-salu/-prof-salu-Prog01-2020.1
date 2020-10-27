package av1;

public class TesteQ5 {

	public static void main(String[] args) {
		Q5_Aluno aluno = new Q5_Aluno();
		
		aluno.setMatricula("1234");
		aluno.setNome("Augusto");
		aluno.setIdade(27);
		aluno.setMediaFinal(6.5);
		
		System.out.println(aluno.exibeInformacoes());

	}

}
