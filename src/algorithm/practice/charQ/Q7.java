package algorithm.practice.charQ;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

		System.out.println(a>b? a:b);
		
		
	}
}
