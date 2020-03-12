package BOJ_1182;

import java.util.*;

public class Main {
	static int N, S, ans;
	static int[] arr;
	static int[] sel;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1;i<=N;i++) {
			sel = new int[i];
			comb(0, 0);
		}
		System.out.println(ans);

	}
	private static void comb(int idx, int s_idx) {
		if(s_idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i];
			}
			if(sum == S) {
				ans++;
			}
			return;
		}
		if(idx == arr.length) {
			return;
		}
		sel[s_idx] = arr[idx];
		comb(idx+1, s_idx+1);
		comb(idx+1, s_idx);
		
	}

}
