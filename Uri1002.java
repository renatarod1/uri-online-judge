import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area, n= 3.14159;
				
		raio = sc.nextDouble();
		area = n * (Math.pow(raio, 2));
		
		System.out.printf("A=%.4f%n",area);
		
		sc.close();
	}
}
