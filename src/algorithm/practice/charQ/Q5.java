package algorithm.practice.charQ;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] alpha = new int[26];
		String m = in.next();
		
		for (int i = 0; i < m.length(); i++) {
			if('A' <= m.charAt(i) && m.charAt(i) <= 'Z') {
				alpha[m.charAt(i)-'A']++;
			} else {
				alpha[m.charAt(i)-'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char)(i + 65);
			} else if (alpha[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
	}
}
