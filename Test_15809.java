package baekjoon;

import java.util.*;
public class Test_15809 {
	static int N, M, cnt;
	static int[] parent;
	static int[] Size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		N = sc.nextInt();
		M = sc.nextInt();
		cnt = 0;
		parent = new int[100001];
		Size = new int[100001];
		for(int i=1;i<=N;i++) {
			int people = sc.nextInt();
			parent[i] = i;
			Size[i] = people;
		}
		for(int i=0;i<M;i++) {
			int cmd = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			Union(cmd, c1, c2);
		}
		for(int i=1;i<=N;i++) {
			if(Size[i] > 0) {
				list.add(Size[i]);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int p : list) {
			System.out.print(p + " ");
		}
		
		
	}
	static void Union(int cmd, int c1, int c2) {
		// TODO Auto-generated method stub
		c1 = find(c1);
		c2 = find(c2);
		if(c1 != c2) {
			if(Size[c1] < Size[c2]) {
				swap(c1, c2);
			}
			parent[c2] = c1;
			if(cmd == 1) {
				Size[c1] += Size[c2];
			}else {
				Size[c1] -= Size[c2];
			}
			Size[c2] = 0;
		}
		
	}
	static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int tmp = Size[a];
		Size[a] = Size[b];
		Size[b] = tmp;
		
	}
	static int find(int c1) {
		// TODO Auto-generated method stub
		if(c1 == parent[c1]) {
			return c1;
		}
		return parent[c1] = find(parent[c1]);
	}

}
