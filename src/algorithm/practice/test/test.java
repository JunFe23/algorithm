package algorithm.practice.test;

import java.util.Arrays;

public class test {

	public static int[][] solution(int N, int[][] mine) {
		int[][] answer = new int[N][N];
	
		// 배열 0으로 초기화
				for(int i=0; i<N; i++){
					for(int j=0; j<N; j++){
						answer[i][j] = 0;
					}
				}
		        
		        // mine 심기
		        int x=0;
		        int y=0;
		        
		        try {
		        	for(int i=0;i<N;i++){
		        		for(int j=0;j<2;j++){
		        				if(j==0)
		        					x=mine[i][j]-1;
		        				else if(j==1)
		        					y=mine[i][j]-1;
		        		}
		        		answer[x][y]=-1;
		        	}
		        	
		        	// 지뢰 근방 조사
			        for(int i=0;i<N;i++) {
			        	for(int j=0;i<N;j++) {
			        		// 지뢰가 있으면 그대로.
			        		if(answer[i][j]==-1) continue;
			        		
			        		// 주변 조
			        		if(i==0) { // 왼쪽 끝인 경우.
			        			// 한칸 오른쪽 체크.
			        			if(answer[i+1][j]==-1) answer[i][j]+=1;
			        			
			        			// 한칸 위 체크.
			        			if(answer[i][j-1]==-1) answer[i][j]+=1;

			        			// 한칸 아래 체크.
			        			if(answer[i][j+1]==-1) answer[i][j]+=1;
			        			
			        			// 왼쪽 위 모서리인 경우.
			        			if(j==0) {
			        				if(answer[0][1]==-1) {
			        					answer[0][0]+=1;
			        				}
			        				if(answer[1][0]==-1) {
			        					answer[0][0]+=1;
			        				}
			        			}
			        			
			        			// 왼쪽 아래 모서리인 경우.
			        			if(j==N-1) {
			        				if(answer[1][N-1]==-1) {
			        					answer[0][N-1]+=1;
			        				}
			        				if(answer[0][N-2]==-1) {
			        					answer[0][N-1]+=1;
			        				}
			        			}
			        			
			        		}
			        	}
			        }
		        
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		        
		        
		        
		        System.out.print(Arrays.deepToString(answer));
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] mine = {{1,1},{1,2}};
		solution(5, mine);
	}
}
