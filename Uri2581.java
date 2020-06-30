import java.io.IOException;
import java.util.Scanner;

public class Uri2581 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
	    
		int n = 0;
		String caso;
		String resp = "I am Toorg!";
		n = sc.nextInt();
		
		for (int i = 0; i <n; i++){
		 	caso = sc.next();
		 	sc.nextLine();
		 	System.out.println(resp);
		}
		
		sc.close();
    } 
}