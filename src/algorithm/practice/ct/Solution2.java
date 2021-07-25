package algorithm.practice.ct;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
	public static int solution(int N, int[][] trees) {
        int answer = 1;
        
        
        Arrays.sort(trees, Comparator.comparingInt(o1 -> o1[0]));
        
        for(int i=0;i<trees.length-1;i++) {
        	if(trees[0][1]>trees[i][1]&&trees[i][1]>=trees[i+1][1]) {
        		answer++;
        	} 
        		
        }
        
        System.out.println(Arrays.deepToString(trees));
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		int [][] arr= {{1,2}, {2,3}, {3,1}, {4,4}, {5,0}};
		solution(7, arr);
	}
}
