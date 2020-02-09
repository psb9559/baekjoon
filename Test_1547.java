package baekjoon;

import java.util.*;
public class Test_1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] map = new int[4];
		map[1] = 1;
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = map[a];
			map[a] = map[b];
			map[b] = tmp;
		}
		for(int i=1;i<=3;i++) {
			if(map[i] == 1) {
				System.out.println(i);
			}
		}

	}

}
