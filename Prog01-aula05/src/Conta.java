
public class Conta {
	//Atributos
	int agencia;
	int numero;
	String cliente;
	String senha;
	String tipo;
	double saldo;
	
	//Comportamentos
	
	//Criar função/método
	
	//void --> indica o retorno da funcao (void = vazio)
	//imprime --> nome da funcao
	//() --> parametros da funcao
	void imprime() {
		System.out.println("Agencia: " + agencia);
		System.out.println("Numero: " + numero);
		System.out.println("Titular: " + cliente);
		System.out.println("Senha: " + senha);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: " + saldo);
		System.out.println();
	}
	
	void saque(double valor) {
		if(saldo >= valor) {
			//saque efetuado
			saldo = saldo - valor;
		}else {
			//falhou
			System.out.println("Saldo insuficiente");
		}
	}
	
	boolean deposito(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
			return true;
		}else {
			return false;
		}
	}
}