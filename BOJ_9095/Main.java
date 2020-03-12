package BOJ_9095;

import java.util.*;

public class Main {
	static int T, N, ans;
	static int[] arr = {1, 2, 3};
	static int[] sel;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			ans = 0;
			for(int i=1;i<=N;i++) {
				sel = new int[i];
				perm(0);
			}
			System.out.println(ans);
		}
	}
	private static void perm(int idx) {
		if(idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i];
			}
			if(sum == N) {
				ans++;
			}
			return;
		}
		for(int i=0;i<arr.length;i++) {
			sel[idx] = arr[i];
			perm(idx+1);
		}
		
	}

}
