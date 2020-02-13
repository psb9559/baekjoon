package baekjoon;

import java.util.*;

public class Test_7576 {
	static class Tomato{
		int row, col, day;
		Tomato(){
			
		}
		Tomato(int row, int col, int day){
			this.row = row;
			this.col = col;
			this.day = day;
		}
	}
	static int[][] map;
	static boolean[][] visit;
	static int r, c, max = 1;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		r = sc.nextInt();
		map = new int[r][c];
		visit = new boolean[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		bfs();
		
	}
	private static void bfs() {
		Queue<Tomato> queue = new LinkedList<>();
		int day = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(map[i][j] == 1) {
					queue.offer(new Tomato(i, j, 0));
				}
			}
		}

		while(!queue.isEmpty()) {
			Tomato t = queue.poll();
			day = t.day;
			for(int k=1;k<=4;k++) {
				int s_dr = t.row + dr[k];
				int s_dc = t.col + dc[k];
				if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
					if(map[s_dr][s_dc] == 0) {
						map[s_dr][s_dc] = 1;
						queue.add(new Tomato(s_dr, s_dc, day+1));	
					}

				}
			}

		}
		boolean flag = false;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(map[i][j] == 0) {
					flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println(day);
		}else {
			System.out.println("-1");
		}

		
	}

}
