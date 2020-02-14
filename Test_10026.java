package algo_0214;

import java.util.*;

class Color{
	int row, col;
	Color(int row, int col){
		this.row = row;
		this.col = col;
	}
}
public class Test_10026 {	
	static char[][] map;
	static boolean[][] check;
	static int[] cnt_list;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new char[N][N];
		check = new boolean[N][N];
		cnt_list = new int[2];
		for(int i=0;i<N;i++) {
			char[] tmp = sc.next().toCharArray();
			for(int j=0;j<N;j++) {
				map[i][j] = tmp[j];
			}
		}
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!check[i][j]) {
					check[i][j] = true;
					bfs(i, j, map[i][j]);
					if(map[i][j] == 'R') {
						cnt1++;
					}else if(map[i][j] == 'G') {
						cnt2++;
					}else if(map[i][j] == 'B') {
						cnt3++;
					}

				}
			}
		}
		System.out.print((cnt1+cnt2+cnt3) + " ");
		check = new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		cnt1 = 0;
		cnt2 = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!check[i][j]) {
					check[i][j] = true;
					bfs(i, j, map[i][j]);
					if(map[i][j] == 'R') {
						cnt1++;
					}else if(map[i][j] == 'B') {
						cnt2++;
					}

				}
			}
		}
		System.out.println((cnt1+cnt2));
		
		
		
	}
	static void bfs(int r, int c, char color) {
		Queue<Color> queue = new LinkedList<>();
		queue.add(new Color(r, c));
		while(!queue.isEmpty()) {
			Color co = queue.poll();
			for(int k=1;k<=4;k++) {
				int s_dr = co.row + dr[k];
				int s_dc = co.col + dc[k];
				if(s_dr >= 0 && s_dr < N && s_dc >= 0 && s_dc < N) {
					if(!check[s_dr][s_dc] && map[s_dr][s_dc] == color) {
						check[s_dr][s_dc] = true;
						bfs(s_dr, s_dc, color);
					}
				}
			}
		}
		
		
	}

}
