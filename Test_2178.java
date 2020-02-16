package baekjoon;

import java.util.*;

class Miro{
	int row, col;
	Miro(int row, int col){
		this.row = row;
		this.col = col;

	}
}
public class Test_2178 {
	static int[][] map;
	static boolean[][] visit;
	static int N, M;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visit = new boolean[N][M];
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<M;j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		visit[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N-1][M-1]);
		

	}
	static void bfs(int x, int y) {
		Queue<Miro> queue = new LinkedList<>();
		queue.add(new Miro(x, y));
		while(!queue.isEmpty()) {
			Miro m = queue.poll();
			for(int k=1;k<=4;k++) {
				int s_dr = m.row + dr[k];
				int s_dc = m.col + dc[k];
				if(s_dr < 0 || s_dr >= N || s_dc < 0 || s_dc >= M) {
					continue;
				}
				if(visit[s_dr][s_dc] || map[s_dr][s_dc] == 0) {
					continue;
				}
				visit[s_dr][s_dc] = true;
				map[s_dr][s_dc] = map[m.row][m.col] + 1;
				queue.add(new Miro(s_dr, s_dc));
				
			}
		}
		
		
		
	}

}
