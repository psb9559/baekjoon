package BOJ_5568;

import java.util.*;
public class Main {
	static int[] arr;
	static int[] sel;
	static boolean[] check;
	static int N, K;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		list = new ArrayList<>();
		arr = new int[N];
		check = new boolean[N];
		sel = new int[K];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		perm(0);
		System.out.println(list.size());
	}
	static void perm(int idx) {
		if(idx == sel.length) {
			String tmp = "";
			for(int i=0;i<sel.length;i++) {
				tmp += Integer.toString(sel[i]);
			}
			int num = Integer.parseInt(tmp);
			if(!list.contains(num)) {
				list.add(num);
			}
			
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
