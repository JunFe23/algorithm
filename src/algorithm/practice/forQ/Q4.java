package algorithm.practice.forQ;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 1;
		for (int i = 0; i < x; i++) {
			System.out.println(y++);
		}
	}
}
