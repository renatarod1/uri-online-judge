import java.util.Scanner;

public class Uri1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String p1, p2, p3;
		
		p1 = sc.next();
		p2 = sc.next();
		p3 = sc.next();
		
		if (p1.equals("vertebrado")) {
			if (p2.equals("ave")) {
				if (p3.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (p3.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
				
			}			
		} else {
			if (p2.equals("inseto")) {
				if (p3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (p3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
		
		sc.close();
	}
}
