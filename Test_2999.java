package baekjoon;

import java.util.*;
public class Test_2999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		int size = s.length();
		int r = 0, c = 0;
		for(int i=1;i<=size/i;i++) {
			if(size % i == 0) {
				r = i;
				c = size / i;
			}
		}
		char[][] map = new char[r][c];
		int k = 0;
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				map[j][i] = arr[k++];
			}
		}
		
		for(int i=0;i<r;i++) {	
			for(int j=0;j<c;j++) {
				System.out.print(map[i][j]);
			}
		}
		
	

	}
}
