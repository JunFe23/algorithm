package algorithm.practice.whileQ;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x!=0&&y!=0) {
			System.out.println(x+y);
			x=sc.nextInt();
			y=sc.nextInt();
		}
	}
}
