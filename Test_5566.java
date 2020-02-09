package baekjoon;

import java.util.*;
public class Test_5566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int idx = 0, result = 0;
		int[] order = new int[n];
		int[] map = new int[m];
		for(int i=0;i<n;i++) {
			order[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			map[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			if(idx < n-1) {
				idx += map[i];
				if(idx < n-1) {
					idx += order[idx];
				}
				result++;
			}
		}
		
		System.out.println(result);
	}

}
