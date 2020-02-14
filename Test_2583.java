package algo_0214;

import java.util.*;
class Paper{
	int row, col;
	Paper(int row, int col){
		this.row = row;
		this.col = col;
	}
}
public class Test_2583 {
	static boolean[][] visit;
	static int[][] map;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	static int M, N, K, cnt, room_cnt;
	static ArrayList<Integer> arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		map = new int[N][M];
		visit = new boolean[N][M];
		arr = new ArrayList<>();
		cnt = 0;
		for(int i=0;i<K;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int x=x1;x<x2;x++) {
				for(int y=y1;y<y2;y++) {
					map[x][y] = 1;
					visit[x][y] = true;
				}
			}
		}
	
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visit[i][j] && map[i][j] == 0) {
					room_cnt = 1;
					visit[i][j] = true;
					bfs(i, j);
					cnt++;
					arr.add(room_cnt);
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();	
		
	}
	static void bfs(int r, int c) {
		Queue<Paper> queue = new LinkedList<>();
		queue.add(new Paper(r, c));
		while(!queue.isEmpty()) {
			Paper p = queue.poll();
			for(int k=1;k<=4;k++) {
				int s_dr = p.row + dr[k];
				int s_dc = p.col + dc[k];
				if(s_dr >= 0 && s_dr < N && s_dc >= 0 && s_dc < M) {
					if(!visit[s_dr][s_dc] && map[s_dr][s_dc] == 0) {
						visit[s_dr][s_dc] = true;
						room_cnt++;
						bfs(s_dr, s_dc);
					}
				}
			}

			
		}
		
		
	}

}
