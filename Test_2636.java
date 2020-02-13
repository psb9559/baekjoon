package baekjoon;

import java.util.*;
public class Test_2636 {
	static int r, c, cnt, last_cnt;
	static int[][] map;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		while(true) {
			int remain_cnt = 0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(map[i][j] == 1) {
						int tmp_cnt = 0;
						for(int k=0;k<4;k++) {
							int nr = i + dr[k];
							int nc = j + dc[k];
							System.out.println(nr + " " + nc);
							if(nr >= 0 && nr < r && nc >= 0 && nc < c) {
								if(map[nr][nc] == 1) {
									map[nr][nc] = -1;
									tmp_cnt += 1;
								}
							}
						}
						System.out.println(i + " " + j + "의 1의개수: " + tmp_cnt);
						if(tmp_cnt < 4) {
							remain_cnt++;
						}
					}else {
						continue;
					}
				}
			}
			int check = 0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(map[i][j] == 0) {
						check += 1;
					}
				}
			}

			if(check == r*c) {
				last_cnt = remain_cnt;
				break;
			}else {
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						if(map[i][j] == -1) {
							map[i][j] = 0;
						}
					}
				}
				cnt++;
			}
		}

		System.out.println(cnt);
		System.out.println(last_cnt);
	

	}

}
