import java.io.IOException;
import java.util.Scanner;

public class Uri1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
	   
	    int n = 0;
		int count = 0;
		
		n = sc.nextInt();
		
		do {
			n = n + 1;
			if (n % 2 != 0){
				count = count + 1;
				System.out.println(n);
			}
		}while (count < 6); 
		
		sc.close(); 
    } 
}