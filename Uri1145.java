import java.util.Scanner;

public class Uri1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for (int i = 1; i <= y; i++) {
			
				
			if (i % x == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
