package algo_0214;

import java.util.*;
public class Test_6603 {
	static int N;
	static int[] map;
	static int[] sel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			N = sc.nextInt();
			if(N == 0)
				break;
			map = new int[N];
			sel = new int[6];
			for(int i=0;i<N;i++) {
				map[i] = sc.nextInt();
			}
			dfs(0, 0);
			System.out.println();
		}
		

	}
	static void dfs(int idx1, int idx2) {
		// TODO Auto-generated method stub
		if(idx2 == sel.length) {
			Arrays.sort(sel);
			for(int i=0;i<sel.length;i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		if(idx1 == map.length) {
			return;
		}
		sel[idx2] = map[idx1];
		dfs(idx1+1, idx2+1);
		dfs(idx1+1, idx2);
	}

}
