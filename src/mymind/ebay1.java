package mymind;

import algorithm.practice.ct.Solution2;

public class ebay1 {

	
	public static int solution(String s) {
        int answer = 0;

        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
			if(c[i]=='0') answer++;
			else answer--;
		}
        
        
        answer = Math.abs(answer);
        System.out.println(answer);
        return answer;

    }
	
	public static void main(String[] args) {
		solution("1011");
	}
}
