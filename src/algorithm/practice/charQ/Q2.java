package algorithm.practice.charQ;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		String a = in.next();
		
		in.close();
		
		int sum = 0;
		
		for (int j = 0; j < i; j++) {
			sum += a.charAt(j)-'0';
		}
		
		System.out.println(sum);
	}
}
