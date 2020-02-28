package baekjoon;

import java.util.*;

public class Test_2251 {
	static int a, b, c;
	static ArrayList<Integer> list;
	static boolean[][] check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		list = new ArrayList<>();
		check = new boolean[a+1][b+1];

		dfs(0, 0, c);
		Collections.sort(list);
		for(int p : list) {
			System.out.print(p + " ");
		}
		System.out.println();

	}
	static void dfs(int x, int y, int z) {
		if(check[x][y]) {
			return;
		}
		if(x == 0) {
			list.add(z);
		}
		check[x][y] = true;
		if(x+y > b) {
			dfs((x+y)-b, b, z);
		}else {
			dfs(0, x+y, z);
		}
		
		if(y+x > a) {
			dfs(a, (y+x)-a, z);
		}else {
			dfs(y+x, 0, z);
		}
		
		if(z+x > a) {
			dfs(a, y, (z+x)-a);
		}else {
			dfs(z+x, y, 0);
		}
		
		if(z+y > b) {
			dfs(x, b, (z+y)-b);
		}else {
			dfs(x, z+y, 0);
		}
		dfs(x, 0, y+z);
		dfs(0, y, x+z);
		
		
	}

}
