
public class Conta {
	//Encapsulamento
	
	//Modificadores de acesso
	//public 	--> Todo mundo tem acesso 
	//private 	--> Apenas a propria classe tem acesso
	
	// Atributos
	private int numero;
	private int agencia;
	private double saldo;
//	String titular;
//	String telefone;
//	String endereco;
	private Cliente titular; 
	
	//Construtor
	
	Conta(int numero, int agencia, double saldo, Cliente titular){
		//Escopo (Variavel local x global)
		//this ==> apontando para a propria classe
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//GET e SET
	
	//GET
	public int getAgencia() {
		return agencia;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	//SET
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	// metodos
	boolean saca(double valor) {
		double taxa = 0.5;
		if (valor <= 0 || valor > saldo) {
			return false;
		}
		saldo = saldo - valor - taxa;
		return true;
	}

	boolean deposita(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo = saldo + valor;
		return true;
	}

	boolean transfere(double valor, Conta favorecido) {
		if(saca(valor) == true) {
			favorecido.deposita(valor);
			return true;
		}		
		return false;
	}
}
