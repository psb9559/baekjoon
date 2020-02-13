package algo_0213;

import java.util.*;

public class BOJ_2667 {
	static int[][] map;
	static boolean[][] check;
	static int N, room_cnt, cnt;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		check = new boolean[N][N];
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(s.charAt(j)+"");
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!check[i][j] && map[i][j] == 1) {
					check[i][j] = true;
					room_cnt = 1;
					dfs(i, j);
					arr.add(room_cnt);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));	
		}
		
	}
	static void dfs(int r, int c) {
		//check[r][c] = true;
		for(int k=1;k<=4;k++) {
			int s_dr = r + dr[k];
			int s_dc = c + dc[k];
			if(s_dr >= 0 && s_dr < N && s_dc >= 0 && s_dc < N) {
				if(!check[s_dr][s_dc] && map[s_dr][s_dc] == 1) {
					check[s_dr][s_dc] = true;
					room_cnt++;
					dfs(s_dr, s_dc);	
				}
			}
		}
	}

}
