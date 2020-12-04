package GS코테연습;


import java.util.*;

public class BOJ_2668 {
	static int[] arr;
	static boolean[] check;
	static int last;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N+1];
		check = new boolean[N+1];
		list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1;i<=N;i++) {
			check[i] = true;
			last = i;
			dfs(i);
			check[i] = false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int k : list) {
			System.out.println(k);
		}
		
	}
	
	private static void dfs(int num) {
		if(!check[arr[num]]) {
			check[arr[num]] = true;
			dfs(arr[num]);
			check[arr[num]] = false;
		}
		if(arr[num] == last) {
			list.add(last);
		}
	}

}
