package N°úM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test_15652 {
	static int[] arr;
	static int[] sel;
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
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		perm(0, 0);
		System.out.println(sb);
	}
	
	static void perm(int idx1, int idx2) {
		if(idx2 == sel.length) {
			for(int i=0;i<sel.length;i++) {
				sb.append(sel[i] + " ");
			}
			sb.append("\n");
			return;
		}
		if(idx1 == arr.length) {
			return;
		}
		sel[idx2] = arr[idx1];
		perm(idx1, idx2+1);
		perm(idx1+1, idx2);
		
	}

}
