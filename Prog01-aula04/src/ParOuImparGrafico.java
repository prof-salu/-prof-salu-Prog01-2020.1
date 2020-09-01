import javax.swing.JOptionPane;

public class ParOuImparGrafico {
	public static void main(String[] args) {
		int numero = 0;

		//Swing		
		 JOptionPane.showMessageDialog(null, "Programa de par ou impar");
		  
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		 //numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Par");
		}else {
			JOptionPane.showMessageDialog(null, "Impar");
		}
	}
}
