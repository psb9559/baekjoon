package BOJ_10974;

import java.util.*;
public class Main {
	static int N;
	static int[] arr;
	static int[] sel;
	static boolean[] check;
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		sel = new int[N];
		check = new boolean[N];
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		perm(0);
	}
	private static void perm(int idx) {
		if(idx == sel.length) {
			for(int i=0;i<sel.length;i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!check[i]) {
				check[i] = true;
				sel[idx] = arr[i];
				perm(idx+1);
				check[i] = false;
			}
		}
		
	}

}
