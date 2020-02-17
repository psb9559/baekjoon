package N°úM;

import java.util.*;
public class Test_15655 {
	static int[] arr;
	static int[] sel;
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
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		com(0, 0);
		System.out.println(sb);
	}
	
	static void com(int idx, int s_idx) {
		if(s_idx == sel.length) {
			for(int i=0;i<sel.length;i++) {
				sb.append(sel[i] + " ");
			}
			sb.append("\n");
			return;
		}
		if(idx == arr.length) {
			return;
		}
		sel[s_idx] = arr[idx];
		com(idx+1, s_idx+1);
		com(idx+1, s_idx);
		
	}

}
