
public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Jose", "123456788", "Rua ABC, 45");
		
		System.out.println("Nome antigo: " + c1.getNome());
		c1.setNome("Pedro");
		System.out.println("Novo nome: " + c1.getNome());

	}

}
