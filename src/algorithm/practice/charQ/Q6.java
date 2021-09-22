package algorithm.practice.charQ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
		
		System.out.println(st.countTokens());
	}
}
