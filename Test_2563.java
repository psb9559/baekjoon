package baekjoon;

import java.util.*;
public class Test_2563 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] paper = new int[n][2];
		int[][] map = new int[101][101];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			paper[i][0] = sc.nextInt();
			paper[i][1] = sc.nextInt();
			for(int l=paper[i][0];l<paper[i][0]+10;l++) {
				for(int k=paper[i][1];k<paper[i][1]+10;k++) {
					map[l][k] = 1;
				}
			}	
		}
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
