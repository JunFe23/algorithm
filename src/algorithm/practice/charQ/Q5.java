package algorithm.practice.charQ;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String m = in.next();
		
		char[] c = new char[m.length()];
		
		char[] alpha = new char[26];
		
		for (int i = 0; i < c.length; i++) {
			c[alpha[i]-'0']++;
		}
	}
}
