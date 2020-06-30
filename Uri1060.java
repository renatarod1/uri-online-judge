import java.io.IOException;
import java.util.Scanner;

public class Uri1060 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	    
		double[] numeros = new double[6];
		int count = 0;
		
		for (int i = 0; i <= 5; i++){
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 0; i <= 5; i++){
			if (numeros[i] > 0){
				count = count + 1;
			}
		}
		
		System.out.println(count + " valores positivos");
		sc.close(); 
    } 
}