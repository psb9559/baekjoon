package baekjoon;

import java.util.*;
public class Test_14499 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N][M];
		int start_x = sc.nextInt();
		int start_y = sc.nextInt();
		int move_cnt = sc.nextInt();
		int[] dr = {0, 0, 0, -1, 1};
		int[] dc = {0, 1, -1, 0, 0};
		int[] move = new int[move_cnt];
		int[] jusa = new int[7];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<move_cnt;i++) {
			move[i] = sc.nextInt();
		}
		int dir, row, col;
		for(int i=0;i<move_cnt;i++) {
			dir = move[i];
			row = start_x + dr[dir];
			col = start_y + dc[dir];
			if(row >= 0 && row < N && col >= 0 && col < M) {
				int top = jusa[1];
				if(dir == 1) {
					jusa[1] = jusa[4];
					jusa[4] = jusa[6];
					jusa[6] = jusa[3];
					jusa[3] = top;				
				}else if(dir == 2) {
					jusa[1] = jusa[3];
					jusa[3] = jusa[6];
					jusa[6] = jusa[4];
					jusa[4] = top;
				}else if(dir == 3) {
					jusa[1] = jusa[5];
					jusa[5] = jusa[6];
					jusa[6] = jusa[2];
					jusa[2] = top;
				}else if(dir == 4) {
					jusa[1] = jusa[2];
					jusa[2] = jusa[6];
					jusa[6] = jusa[5];
					jusa[5] = top;
				}
				start_x = row;
				start_y = col;
				if(map[start_x][start_y] == 0) {
					map[start_x][start_y] = jusa[6];
				}else {
					jusa[6] = map[start_x][start_y];
					map[start_x][start_y] = 0;
				}
				System.out.println(jusa[1]);
			}
			
		}
		
	}

}
