package algo_0214;

import java.util.*;

public class Test_1260_인접리스트 {
	static int N;
	static int M;
	static int V;
	static boolean[] visit;
	static ArrayList<Integer>[] adj;
	static Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		adj = new ArrayList[N+1];
		queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			adj[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a].add(b);
			adj[b].add(a);
			
		}
		

		for(int i=1;i<=N;i++) {
			Collections.sort(adj[i]);
		}

		visit = new boolean[N+1];
		visit[V] = true;
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
		for(int i=0;i<adj[v].size();i++) {
			if(!visit[adj[v].get(i)]) {
				visit[adj[v].get(i)] = true;
				dfs(adj[v].get(i));
			}
		}
		
		
	}
	static void bfs() {
		while(!queue.isEmpty()) {
			int num = queue.poll();
			System.out.print(num + " ");
			for(int i=0;i<adj[num].size();i++) {
				if(!visit[adj[num].get(i)]) {
					queue.add(adj[num].get(i));
					visit[adj[num].get(i)] = true;
				}
			}
			
		}
	}

}
