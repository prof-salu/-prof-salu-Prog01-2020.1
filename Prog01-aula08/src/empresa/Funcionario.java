package empresa;

public class Funcionario extends Object {
	//Encapsular
	
	/*Modificadores de acesso: 
	 * 
	 * (~) default ==>   Classes que estão no mesmo pacote possuem acesso.
	 * (+) public ==>    Qualquer classe possui acesso.
	 * (-) private ==>   Apenas a própria classe possui acesso.
	 * (#) protected ==> Classes filhas e que estão no mesmo "pacote" possuem acesso.
	 * */
	
	private String nome;
	private String cpf;
	private double salario;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double calculaBonificacao() {
		double bonificacao = salario * 0.10;
		return bonificacao;
	}
}