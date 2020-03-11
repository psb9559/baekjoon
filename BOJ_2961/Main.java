package BOJ_2961;

import java.util.*;

public class Main {
	static int N, t1, t2, ans;
	static int[][] list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		list = new int[N+1][2];
		ans = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				comb(j, i, list[j][0], list[j][1]);
			}
		}
		
		System.out.println(ans);
		
	}
	private static void comb(int depth, int n, int taste1, int taste2) {
		// TODO Auto-generated method stub
		if(depth == n) {
			int tmp = Math.abs(taste1-taste2);
			ans = Math.min(ans, tmp);
			return;
		}
		for(int i=depth+1;i<N;i++) {
			comb(i, n, taste1 * list[i][0], taste2 + list[i][1]);
		}
		
		
	}

}
