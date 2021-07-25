package algorithm.practice.ct;

import java.util.Arrays;

class Solution {
    public static boolean solution(int[] arrA, int[] arrB) {
        int[] arrC=arrA;
        int x = 0;
        
        while(x!=arrC.length){
        	int temp = arrC[arrC.length-1];
        	for(int i=arrC.length-1;i>=1;i--){
        		arrC[i]=arrC[i-1];
        	}
        	arrC[0]=temp;
        	if(arrC[0]==arrB[0]) {
        		break;
        	} else {
        		x++;
        	}
        } 
      
        
        boolean answer;
        if(Arrays.equals(arrB, arrC)) {
        	answer=true;
        } else {
        	answer=false;
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] arrA= {4,3,2,1};
    	int[] arrB= {1,4,3,2};
    	solution(arrA, arrB);
	}
}