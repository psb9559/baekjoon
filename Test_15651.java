package N°úM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test_15651 {
	static int[] arr;
	static int[] sel;
	static boolean[] visit;
	static int N, M;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);
		sb = new StringBuilder();
		arr = new int[N];
		sel = new int[M];
		visit = new boolean[N];
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
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
			sel[idx] = arr[i];
			perm(idx+1);		
		}
		
	}

}
