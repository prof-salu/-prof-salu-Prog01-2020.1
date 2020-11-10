
public class TestaFuncionarios {
	
	public static void main(String[] args) {
		
		Motorista m1 = new Motorista();
		m1.setNome("Carlos");
		m1.setMatricula("5566");
		m1.setCargo("M12");
		m1.setTotalHoras(230);
		m1.setValorHora(12);
		System.out.println("Salario Carlos: " + m1.calcularSalario());
		
		Vendedor v1 = new Vendedor();
		v1.setNome("Cristina");
		v1.setMatricula("8877");
		v1.setCargo("Vendedor Junior");
		v1.setSalario(1200);
		v1.setComissao(0.05); //5%
		v1.setTotalVendas(30000);
		System.out.println("Salario Cristina: " + v1.calcularSalario());
		
		Programador p1 = new Programador();
		p1.setMatricula("9876");
		p1.setNome("Henrique");
		p1.setCargo("Dev junior");
		p1.setSalario(3500);
		//System.out.println("Salario Henrique: " + p1.calcularSalario());
		
		FolhaSalarial folha = new FolhaSalarial();
		
		folha.adicionarFolha(m1);
		folha.adicionarFolha(v1);
		//folha.adicionarFolha(p1);
		
		System.out.println("Total pago no mês: " + folha.getTotalPago());
	}
}