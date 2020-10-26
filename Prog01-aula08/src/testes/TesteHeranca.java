package testes;

import empresa.Funcionario;
import empresa.Gerente;
import empresa.Secretaria;
import empresa.Vendedor;
import empresa.VendedorExterno;

public class TesteHeranca {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Vendedor v1 = new Vendedor();
		Gerente g1 = new Gerente();
		Secretaria s1 = new Secretaria();
		VendedorExterno e1 = new VendedorExterno();
		
		f1.setNome("Carlos");
		f1.setSalario(3000);
		System.out.println("Funcionario: " + f1.calculaBonificacao());
		
		v1.setNome("Ana");
		v1.setSalario(4000);
		System.out.println("Vendedor: " + v1.calculaBonificacao());
		
		g1.setNome("Mariano");
		g1.setSalario(7000);
		System.out.println("Gerente: " + g1.calculaBonificacao());		
		
//		f1.nome = "Carlos";
//		f1.cpf = "123456";
//		f1.endereco = "Rua ABC";
//		f1.salario = 2000;
//		
//		v1.nome = "Ana";
//		v1.cpf = "6777778";
//		v1.endereco = "Rua ABCD";
//		v1.salario = 3000;
//		v1.comissao = 0.10;
//		v1.totalVendas = 25000;
//		
//		g1.nome = "Marcus";
//		g1.cpf = "998877";
//		g1.endereco = "Rua FGE";
//		g1.salario = 5000;
//		g1.senha = "1234";
//		g1.qtdFuncionarios = 5;
//		
//		s1.nome = "Henrique";
//		s1.cpf = "999888";
//		s1.endereco = "Rua XVS";
//		s1.salario = 3000;
//		s1.idioma = "Alemão";
//		s1.velocidadeDigitacao = 50;
//		
//		e1.nome = "Claudia";
//		e1.cpf = "1234567";
//		e1.endereco = "Rua WMT";
//		e1.salario = 3800;
//		e1.comissao = 0.15;
//		e1.totalVendas = 30500;
//		e1.cnh = "99887765";
	}
}
