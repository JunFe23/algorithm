package algorithm.practice.forQ;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = x;
		for (int i = 0; i < x; i++) {
			System.out.println(y--);
		}
	}
}

