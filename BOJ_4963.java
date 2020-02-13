package algo_0213;

import java.util.*;
public class BOJ_4963 {
	static int[][] map;
	static boolean[][] check;
	static int[] dr = {0, -1, 1, 0, 0, -1, 1, 1, -1};
	static int[] dc = {0, 0, 0, -1, 1, 1, 1, -1, -1};
	static int w, h, cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			cnt = 0;
			if(w == 0 && h == 0) {
				break;
			}
			map = new int[w][h];
			check = new boolean[w][h];
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			check = new boolean[w][h];
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					if(!check[i][j] && map[i][j] == 1) {
						check[i][j] = true;
						dfs(i, j);
						cnt++;

					}
				}
			}
			System.out.println(cnt);
		}


	}

	private static void dfs(int r, int c) {
		for(int k=1;k<=8;k++) {
			int s_dr = r + dr[k];
			int s_dc = c + dc[k];
			if(s_dr >= 0 && s_dr < w && s_dc >= 0 && s_dc < h) {
				if(!check[s_dr][s_dc] && map[s_dr][s_dc] == 1) {
					check[s_dr][s_dc] = true;
					dfs(s_dr, s_dc);
				}
			}
		}
			
	}

}
