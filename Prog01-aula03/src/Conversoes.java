
public class Conversoes {

	public static void main(String[] args) {
		int a = 10;
		long b = 15;
		short c = 1;
		
		//Conversao (cast) implicita
		long x2 = a;
		
		//Conversao explicita
		int x1 = (int) b;		
		
		
		byte y1 = 120;
		short y2 = 150;
		
		short y3 = y1;
		byte y4 = (byte) y2;
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		//overflow
		System.out.println(y4);
		
		String nome = "Salu";
		String sobrenome = "Oliveira";
		
		System.out.println(nome + " " + sobrenome);
		
		System.out.println(nome + 123);
		
		System.out.println(123 + sobrenome);
		
		System.out.println(5+5);
		
		int z = 10;
		//z = z + 5;
		z += 5;
		System.out.println(z);
		
		int num = 10;
		System.out.println(num);
		int m1 = num++;
		System.out.println(m1);
		int m2 = ++num;
		System.out.println(m2);
		
		int y = (10<5)?2:5;
		
		System.out.println(y);
		
		int y12;
		
		if(10 < 5) {
			y12 = 2;
		}else {
			y12 = 5;
		}
		
		final double PI = 3.1416;
		
		//PI = 5;
	}
	
	
}