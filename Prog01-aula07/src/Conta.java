
public class Conta {
	//Encapsulamento
	
	//Modificadores de acesso
	//public 	--> Todo mundo tem acesso 
	//private 	--> Apenas a propria classe tem acesso
	//default	--> 
	//protected --> 
	
	//Variaveis de instancia
	// Atributos
	private int numero;
	private int agencia;
	private double saldo;
//	String titular;
//	String telefone;
//	String endereco;
	private Cliente titular; 
	
	//Variavel de classe ==> static
	private static int totalDecontas = 0;
	
	//Construtor
	
	public Conta(int numero, int agencia, double saldo, Cliente titular){
		//Escopo (Variavel local x global)
		//this ==> apontando para a propria classe
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
		totalDecontas = totalDecontas + 1;
	}
	
	//GET e SET
	
	//GET
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}	
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotalDeContas() {
		return totalDecontas;
	}
	
	//SET
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;		
	}
	
	// metodos
	public boolean saca(double valor) {
		double taxa = 0.5;
		if (valor <= 0 || valor > saldo) {
			return false;
		}
		saldo = saldo - valor - taxa;
		return true;
	}

	public boolean deposita(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo = saldo + valor;
		return true;
	}

	public boolean transfere(double valor, Conta favorecido) {
		if(saca(valor) == true) {
			favorecido.deposita(valor);
			return true;
		}		
		return false;
	}
}
