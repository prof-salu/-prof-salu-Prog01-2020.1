
public class Funcionario {
	private int matricula;
	private String nome;
	private double salario;
	private String email;
	
	private static int totalFuncionarios = 0;
	
	public Funcionario(int matricula, String nome, double salario, String email) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.email = email;
		totalFuncionarios++;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static int getTotalFuncionarios() {
		return totalFuncionarios;
	}
	
	public double calcularAumento(double aumento) {
		double valorDoAumento = getSalario() * aumento;
		return valorDoAumento + getSalario();
	}
	
}
