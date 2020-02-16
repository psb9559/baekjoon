package baekjoon;

import java.util.*;
public class Test_11724 {
	static int n, m, cnt;
	static ArrayList<Integer>[] list;
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		list = new ArrayList[n+1];
		for(int i=1;i<=n;i++) {
			list[i] = new ArrayList<>();
		}
		visit = new boolean[n+1];
		for(int i=1;i<=m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		for(int i=1;i<=n;i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	static void dfs(int v) {
		// TODO Auto-generated method stub
		visit[v] = true;
		for(int i=0;i<list[v].size();i++) {
			if(!visit[list[v].get(i)]) {
				visit[list[v].get(i)] = true;
				dfs(list[v].get(i));
			}
		}
		
		
	}

}
