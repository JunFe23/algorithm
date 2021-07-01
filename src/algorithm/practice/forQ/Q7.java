package algorithm.practice.forQ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < x; i++) {
			st =  new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = a+b;
						
			bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+c+"\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}
