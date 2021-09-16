package algorithm.practice.charQ;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		int a = in.nextInt();
		int sum = 0;
		
		for (int j = 0; j < i; j++) {
			int b= a%10;
			a=a/10;
			sum += b;
		}
		
		System.out.println(sum);
	}
}
