package baekjoon;

import java.util.*;
public class Test_11399ver2 {
	static int MIN = 0;
	static int N;
	static int[] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N+1];
		for(int i=1;i<=N;i++) {
			map[i] = sc.nextInt();
		}
		Arrays.sort(map);
		for(int i=1;i<=N;i++) {
			map[i] = map[i-1] + map[i];
			MIN += map[i];
		}
		
		System.out.println(MIN);
		

	}
	
	
	

}
