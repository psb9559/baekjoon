package baekjoon;

import java.util.*;
public class Test_15813 {
	static int N, sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String tmp = sc.next();
		for(int i=0;i<N;i++) {
			sum += (int)(tmp.charAt(i) - 64);
		}
		System.out.println(sum);
		
		

	}

}
