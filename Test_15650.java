package N°úM;

import java.util.*;
public class Test_15650 {
	static int[] arr;
	static int[] sel;
	static int N, M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		sel = new int[M];
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		perm(0, 0);
		

	}
	static void perm(int idx, int s_idx) {
		if(s_idx == sel.length) {
			for(int i=0;i<s_idx;i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
			return;
		}
		if(idx == arr.length) {
			return;
		}
		
		sel[s_idx] = arr[idx];
		perm(idx+1, s_idx+1);
		perm(idx+1, s_idx);
	}

}
