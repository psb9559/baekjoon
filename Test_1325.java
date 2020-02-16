package baekjoon;

import java.util.*;

public class Test_1325 {
	static int[] arr;
	static boolean[] visit;
	static ArrayList<Integer>[] list;
	static int n, m, max_cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		max_cnt = 0;
		list = new ArrayList[n+1];
		arr = new int[10001];
		for(int i=1;i<=n;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
		}
		for(int i=1;i<=n;i++) {
			visit = new boolean[n+1];
			bfs(i);
		}
		for(int i=1;i<=n;i++) {
			if(arr[i] > max_cnt) {
				max_cnt = arr[i];
			}
		}
		for(int i=1;i<=n;i++) {
			if(arr[i] == max_cnt) {
				System.out.print(i + " ");
			}
		}
		

	}

	private static void bfs(int v) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visit[v] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			for(int i=0;i<list[num].size();i++) {
				int idx = list[num].get(i);
				if(!visit[idx]) {
					visit[idx] = true;
					arr[idx]++;
					queue.add(idx);
				}
			}
		}
		
	}

}
