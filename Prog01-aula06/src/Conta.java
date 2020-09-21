
public class Conta {
	// Atributos
	int numero;
	int agencia;
	double saldo;
	String titular;

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
