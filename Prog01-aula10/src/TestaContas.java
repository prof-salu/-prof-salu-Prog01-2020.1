
public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setNumeroConta(1234);
		cc.setTaxaDeOperacao(0.05);
		
		cp.setNumeroConta(5678);
		cp.setLimite(500);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CP (+limite): " + (cp.getSaldo() + cp.getLimite()));
		System.out.println();
		
		cc.depositar(500);
		cp.depositar(500);
		
		
		System.out.println(" + Deposito de 500");
		System.out.println();
		
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CP (+limite): " + (cp.getSaldo() + cp.getLimite()));
		System.out.println();
		
		cc.sacar(100);
		cp.sacar(100);
		
		
		System.out.println("- Saque de 100");
		System.out.println();
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CP (+limite): " + (cp.getSaldo() + cp.getLimite()));
		System.out.println();
		
		cc.sacar(600);
		cp.sacar(600);
		
		
		System.out.println("- Saque de 600");
		System.out.println();
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CP (+limite): " + (cp.getSaldo() + cp.getLimite()));
		System.out.println();
		
		cc.transferir(200, cp);
		
		System.out.println("***Transferencia de 200 da CC para a CP***");
		System.out.println();
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CP (+limite): " + (cp.getSaldo() + cp.getLimite()));
		System.out.println();
		
		
//		cc.mostrarDados();
//		System.out.println();
//		cp.mostrarDados();

	}
}