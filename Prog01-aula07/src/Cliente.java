
public class Cliente {
	private String nome;
	private String telefone;
	private String endereco;
	
	public Cliente(String nome, String telefone, String endereco){
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	//Encapsulamento
		// GET ==>	retorna um valor de uma propriedade. 
		// SET ==>	atribui um valor a uma propriedade.
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}













