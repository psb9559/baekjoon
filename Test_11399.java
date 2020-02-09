package baekjoon;

import java.util.*;
public class Test_11399 {
	static int MIN = Integer.MAX_VALUE;
	static int N;
	static int[] map;
	static int[] sel;
	static boolean[] check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N];
		sel = new int[N];
		check = new boolean[N];
		for(int i=0;i<N;i++) {
			map[i] = sc.nextInt();
		}
		sol(0,0);
		System.out.println(MIN);
		

	}
	
	static void sol(int idx, int sel_idx) {
		if(idx == N) {
			int result_sum = 0;
			for(int i=0;i<sel.length;i++) {
				int sum = 0;
				for(int j=0;j<=i;j++) {
					sum += sel[i];
				}
				result_sum += sum;
			}
			
			if(MIN >= result_sum) {
				MIN = result_sum;
			}
			return;
		}
		for(int i=0;i<map.length;i++) {
			if(!check[i]) {
				sel[i] = map[idx]; 
				check[i] = true;
				sol(idx+1, sel[i]);
				check[i] = false;
			}
		}
		
	}

}
