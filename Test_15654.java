package N°úM;

import java.util.*;
public class Test_15654 {
	static int[] arr;
	static int[] sel;
	static boolean[] visit;
	static int N, M;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sb = new StringBuilder();
		arr = new int[N];
		sel = new int[M];
		visit = new boolean[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		perm(0);
		System.out.println(sb);
	}
	
	static void perm(int idx) {
		if(idx == sel.length) {
			for(int i=0;i<sel.length;i++) {
				sb.append(sel[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(!visit[i]) {
				sel[idx] = arr[i];
				visit[i] = true;
				perm(idx+1);
				visit[i] = false;
			}
		}
		
	}

}
