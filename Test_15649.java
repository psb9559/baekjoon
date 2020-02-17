package N°úM;

import java.util.*;
public class Test_15649 {
	static int[] arr;
	static int[] sel;
	static boolean[] visit;
	static int N, M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		sel = new int[M];
		visit = new boolean[N+1];
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		perm(0);
		

	}
	static void perm(int idx) {
		if(idx == sel.length) {
			for(int i=0;i<idx;i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
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
