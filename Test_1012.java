package baekjoon;

import java.util.*;
public class Test_1012 {
	static int[][] map;
	static boolean[][] check;
	static int r, c, jirung_cnt, baechu_cnt;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	static class Baechu{
		int row, col;
		Baechu(){
			
		}
		Baechu(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			r = sc.nextInt();
			c = sc.nextInt();
			baechu_cnt = sc.nextInt();
			map = new int[r][c];
			check = new boolean[r][c];
			for(int i=0;i<baechu_cnt;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b] = 1;
			}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(!check[i][j] && map[i][j] == 1) {
						check[i][j] = true;
						bfs(i, j);
						jirung_cnt++;
					}
				}
			}
			System.out.println(jirung_cnt);
			jirung_cnt = 0;
		}

	}
	private static void bfs(int nr, int nc) {
		// TODO Auto-generated method stub
		Queue<Baechu> queue = new LinkedList<>();
		queue.add(new Baechu(nr, nc));
		while(!queue.isEmpty()) {
			Baechu b = queue.poll();
			for(int k=1;k<=4;k++) {
				int s_dr = b.row + dr[k];
				int s_dc = b.col + dc[k];
				if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
					if(!check[s_dr][s_dc] && map[s_dr][s_dc] == 1) {
						check[s_dr][s_dc] = true;
						bfs(s_dr, s_dc);
					}
				}
			}
		}
		
	}

}
