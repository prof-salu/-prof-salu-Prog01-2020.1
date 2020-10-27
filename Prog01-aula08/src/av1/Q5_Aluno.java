package av1;

public class Q5_Aluno {
	// Crie uma classe chamada Aluno. Defina suas características
	// (matrícula, nome, idade, média final). Escreva os métodos get/set para cada
	// característica.
	// A classe Aluno deve possuir um construtor sem parâmetros (“vazio”) e outro
	// com parâmetros
	// (“cheio”). Escreva um método chamado exibeInformacoes() que retorna uma
	// String exibindo todas as características de um aluno.

	private String matricula;
	private String nome;
	private int idade;
	private double mediaFinal;

	public Q5_Aluno() {

	}

	public Q5_Aluno(String matricula, String nome, int idade, double mediaFinal) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.mediaFinal = mediaFinal;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getMediaFInal() {
		return mediaFinal;
	}
	
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	public String exibeInformacoes() {
		return "Aluno[" + "Matricula: " + matricula + ", Nome: " + nome + ", Idade: " 
					+ idade + ", Media Final: " + mediaFinal + "];";
	}
}
