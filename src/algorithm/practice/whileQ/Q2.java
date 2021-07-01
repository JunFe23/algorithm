package algorithm.practice.whileQ;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x+y);
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
						
		}
	}
}
