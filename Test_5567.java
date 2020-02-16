package baekjoon;

import java.util.*;
public class Test_5567 {
	static int n, m, cnt;
	static boolean[] visit;
	static int[][] list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		list = new int[n+1][n+1];
		visit = new boolean[n+1];

		for(int i=1;i<=m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a][b] = 1;
			list[b][a] = 1;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(Arrays.toString(list[i]));
		}
		for(int i=2;i<=n;i++) {
			if(list[1][i] == 1) {
				if(!visit[i]) {
					cnt++;
					visit[i] = true;
				}
			
				for(int j=2;j<=n;j++) {
					if(list[i][j] == 1 && !visit[j]) {
						cnt++;
						visit[j] = true;
					}
				}
			}
			
		}
		System.out.println(cnt);

	}
	

}
