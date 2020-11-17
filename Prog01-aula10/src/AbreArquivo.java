import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AbreArquivo {
	public static void main(String[] args)throws FileNotFoundException{
		abrirArquivo();
		System.out.println("Arquivo encontrado");
	}

	public static void abrirArquivo() throws FileNotFoundException{
		File file = new File("F\\:Projetos\\Java\\EclipseProjects\\Prog01-aula10\\src\\arquivo.txt");
		FileInputStream input = new FileInputStream(file);
	}
}