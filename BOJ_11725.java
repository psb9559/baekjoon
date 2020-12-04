package GS코테연습;

import java.util.*;

public class BOJ_11725 {
	static int N;
	static int[] parent;
	static ArrayList<ArrayList<Integer>> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		parent = new int[N+1];
		list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i=1;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}

		bfs(1);
		for(int i=2;i<=N;i++) {
			System.out.println(parent[i]);
		}
		
	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		parent[start] = 1;
		while(!queue.isEmpty()) {
			int node = queue.poll();
			for(int k : list.get(node)) {
				if(parent[k] == 0) {
					parent[k] = node;
					queue.add(k);
				}
			}
		}
	}
}
