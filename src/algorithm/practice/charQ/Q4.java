package algorithm.practice.charQ;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		

		try {
			for (int i = 0; i < testcase; i++) {
				int n = in.nextInt();
				String input = in.next();
				
				char[] c = new char[input.length()];
				
				for (int j = 0; j < c.length; j++) {
					c[j] = input.charAt(j);
				}
				
				for (int j = 0; j < input.length()*n; j++) {
					int cnt = 0;
					while(cnt<n) {
						System.out.print(c[j]);
						cnt++;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
