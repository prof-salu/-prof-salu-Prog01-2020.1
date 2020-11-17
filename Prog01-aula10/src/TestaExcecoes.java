import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaExcecoes {
	public static void main(String[] args) {
		
		
		
		//int i = 5 / 0;		
		//System.out.println(i);
		
		
		//checked
		try {
			File file = new File("F:\\Projetos\\Java\\EclipseProjects\\Prog01-aula10\\src\\arquivo.txt");
			FileInputStream input = new FileInputStream(file);	
			
			//not_checked
			String nome = null;
			System.out.println(nome.toString());
			
			int i = 5 / 0;		
			System.out.println(i);			
		}catch (ArithmeticException e){
			System.out.println("nao pode dividir por zero: " + e);
		}catch (NullPointerException e) {
			System.out.println("acessando valor nulo: " + e);
		}catch(FileNotFoundException e) {
			System.out.println("arquivo não encontrado: " + e);
		}catch (Exception e) {
			System.out.println("erro generico: " + e);
		}finally {
			System.out.println("Fim do programa");
		}
	}
}
