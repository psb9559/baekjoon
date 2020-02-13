package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test_14502 {
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	static int[][] map;
	static int[][] temp;
	static int r, c, result;
	static class Virus{
		int row, col;
		Virus(){
			
		}
		Virus(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map = new int[r][c];
		temp = new int[r][c];
		result = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(map[i][j] == 0) {
					for(int k=0;k<r;k++) {
						for(int l=0;l<c;l++) {
							temp[k][l] = map[k][l];
						}
					}
					temp[i][j] = 1;
					makewall(1);
					temp[i][j] = 0;
				}
			}
		}
		
		System.out.println(result);
			

	}
	private static void makewall(int cnt) {
		if(cnt == 3) {
			bfs();
			return;
		}
		for(int k=0;k<r;k++) {
			for(int l=0;l<c;l++) {
				if(temp[k][l] == 0) {
					temp[k][l] = 1;
					makewall(cnt+1);
					temp[k][l] = 0;
				}
				
			}
		}
		
	}
	private static void bfs() {
		int[][] tmp_map = new int[r][c];
		Queue<Virus> queue = new LinkedList<>();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				tmp_map[i][j] = temp[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(tmp_map[i][j] == 2) {
					queue.add(new Virus(i, j));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Virus v = queue.poll();
			for(int k=1;k<=4;k++) {
				int s_dr = v.row + dr[k];
				int s_dc = v.col + dc[k];
				if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
					if(tmp_map[s_dr][s_dc] == 0) {
						tmp_map[s_dr][s_dc] = 2;
						queue.add(new Virus(s_dr, s_dc));
					}
				}
			}
		}
		int tmp_cnt = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(tmp_map[i][j] == 0) {
					tmp_cnt++;
				}
			}
		}
		result = Math.max(result, tmp_cnt);
	
	}

}
