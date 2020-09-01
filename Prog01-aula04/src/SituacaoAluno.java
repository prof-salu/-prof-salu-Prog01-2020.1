
public class SituacaoAluno {
	public static void main(String[] args) {
		double n1 = 2, n2 = 5, n3 = 2;
		double media;		
		
		media = (n1 +n2 + n3)/3;
		
		if(media >= 7) {
			System.out.println("Aluno aprovado");
		}else {
			if(media >= 4 && media < 7) {
				System.out.println("Aluno em prova final");
			}else {
				System.out.println("Aluno reprovado");
			}
		}
		
//		if(media >= 7) {
//			System.out.println("Aluno aprovado");
//		}else if(media >= 4 && media < 7) {
//			System.out.println("Aluno em prova final");
//		}else {
//			System.out.println("Aluno reprovado");
//		}		
	}
}