package baekjoon;

import java.util.*;
public class Test_2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] total_cnt = new int[4];
		int[] up = new int[4];
		int[] down = new int[4];
		int total = 0;
		for(int i=0;i<4;i++) {
			down[i] = sc.nextInt();
			up[i] = sc.nextInt();
			int sum = up[i] - down[i];
			total += sum; 
			total_cnt[i] = total; 
		}
		Arrays.sort(total_cnt);
		System.out.println(total_cnt[3]);

	}

}
