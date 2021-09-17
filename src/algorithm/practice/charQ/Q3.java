package algorithm.practice.charQ;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		char[] temp = new char[s.length()];
		
		int[] result = new int[26];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			temp[i] = s.charAt(i);
			n = temp[i]-'0';
			
			if(result[n-49]==-1)
			result[n-49] = i;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
			
		}
	}
}