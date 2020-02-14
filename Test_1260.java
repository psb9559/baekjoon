package algo_0214;

import java.util.*;
public class Test_1260 {
	static int N, M, V;
	static int[][] map;
	static boolean[] visit;
	static Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		queue = new LinkedList<>();
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;	
		}
		
		dfs(V);
		System.out.println();
		
		visit = new boolean[N+1];
		queue.add(V);
		visit[V] = true;
		bfs();
	}
	static void dfs(int v) {
		visit[v] = true;
		System.out.print(v + " ");
		for(int i=1;i<=N;i++) {
			if(map[v][i] == 1 && !visit[i]) {
				visit[i] = true;
				dfs(i);
			}
		}
		
		
	}
	static void bfs() {
		while(!queue.isEmpty()) {
			int num = queue.poll();
			System.out.print(num + " ");
			for(int i=1;i<=N;i++) {
				if(map[num][i] == 1 && !visit[i]) {
					queue.add(i);
					visit[i] = true;
				}
			}
			
		}
	}
	

}
