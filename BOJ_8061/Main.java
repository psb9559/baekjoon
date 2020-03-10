package BOJ_8061;

import java.util.*;

class Dot{
	int row, col, count;
	Dot(int row, int col, int count){
		this.row = row;
		this.col = col;
		this.count = count;
	}
}
public class Main {
	static int N, M, ans;
	static int[][] map;
	static int[][] result;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static Queue<Dot> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		queue = new LinkedList<>();
		map = new int[N][M];
		result = new int[N][M];
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<M;j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 1) {
					result[i][j] = 0;
					queue.add(new Dot(i, j, 0));
				}else {
					result[i][j] = Integer.MAX_VALUE;
				}
				
			}
		}
		bfs();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		

	}
	private static void bfs() {
		while(!queue.isEmpty()) {
			Dot d = queue.poll();
			int x = d.row;
			int y = d.col;
			int cnt = d.count;
			for(int k=0;k<4;k++) {
				int nr = x + dr[k];
				int nc = y + dc[k];
				if(nr >= 0 && nr < N && nc >= 0 && nc < M && cnt+1 < result[nr][nc]) {
					result[nr][nc] = cnt+1;
					queue.add(new Dot(nr, nc, cnt+1));
				}
			}
		}
	}



}
