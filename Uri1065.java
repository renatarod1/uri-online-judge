import java.io.IOException;
import java.util.Scanner;

public class Uri1065 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       
       int n = 0;
       int count = 0;
	   	
		for (int i = 1; i <=5; i++){
		 	n = sc.nextInt();
			 
			if (n % 2 == 0){
				count = count + 1;
			}
		}
		
       	System.out.println(count + " valores pares");
		
		sc.close(); 
    } 
}