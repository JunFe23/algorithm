package algorithm.practice.forQ;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
				
		for (int i = x; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= x-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
