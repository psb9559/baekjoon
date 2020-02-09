package baekjoon;

import java.util.Scanner;

public class Test_14502 {
	static int[] dr = {0, -1, 1, 0, 0, -1, 1, 1, -1};
	static int[] dc = {0, 0, 0, -1, 1, 1, 1, -1, -1};
	static int[][] map;
	static int N, M;
	static int MAX = 0;
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 0) {
					cnt++;
				}
			}
		}
		
		

	}
	public static void sol() {
		
	}

}
