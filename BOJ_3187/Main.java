package BOJ_3187;

import java.util.*;
class Dot{
	int row, col;
	Dot(int row, int col){
		this.row = row;
		this.col = col;
	}
	
}
public class Main {
	static int r, c, w_cnt, s_cnt;
	static char[][] map;
	static boolean[][] visit;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map = new char[r][c];
		visit = new boolean[r][c];
		s_cnt = 0;
		w_cnt = 0;
		for(int i=0;i<r;i++) {
			String s = sc.next();
			for(int j=0;j<c;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(!visit[i][j] && map[i][j] != '#') {
					visit[i][j] = true;
					bfs(i, j);
				}
			}
		}

		System.out.println(s_cnt + " " + w_cnt);

	}
	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		Queue<Dot> queue = new LinkedList<>();
		queue.add(new Dot(x, y));
		int wolf = 0, sheep = 0;
		if(map[x][y] == 'v') {
			wolf++;
		}else if(map[x][y] == 'k') {
			sheep++;
		}
		while(!queue.isEmpty()) {
			Dot d = queue.poll();
			for(int k=0;k<4;k++) {
				int nr = d.row + dr[k];
				int nc = d.col + dc[k];
				if(nr >= 0 && nr < r && nc >= 0 && nc < c && map[nr][nc] != '#' && !visit[nr][nc]) {
					visit[nr][nc] = true;
					if(map[nr][nc] == 'v') {
						wolf++;
					}else if(map[nr][nc] == 'k') {
						sheep++;
					}
					queue.add(new Dot(nr, nc));
				}
			}
		}
		if(sheep > wolf) {
			s_cnt += sheep;
		}else {
			w_cnt += wolf;
		}
		
		
	}

}
