package empresa;

public class Gerente extends Funcionario{
	private String senha;
	private int qtdFuncionarios;
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}
	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	@Override
	public double calculaBonificacao() {
//		double bonificacao = getSalario() * 0.10;
//		bonificacao = bonificacao + 1000;
		
		return super.calculaBonificacao() + 1000;
	}
	
}
