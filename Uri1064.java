import java.io.IOException;
import java.util.Scanner;

public class Uri1064 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
		
	    double[] vetValoresEntrada = new double[6];
		
		for (int i = 0; i <= 5; i++){
			vetValoresEntrada[i] = sc.nextDouble();
		}		
		 	
		int count = 0;
		double soma = 0.0;
		
		for (int i = 0; i <= 5; i++){
			if (vetValoresEntrada[i] > 0){
				count = count + 1;		
				soma = soma + vetValoresEntrada[i];
			}			
			
		}		
		double media = soma / count;
		System.out.println(count +" valores positivos");
		System.out.printf("%.1f\n", media);
		sc.close();		
    }
 
}