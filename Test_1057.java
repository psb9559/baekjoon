package baekjoon;

import java.util.*;
public class Test_1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		while(a != b) {
			a = (a+1) / 2;
			b = (b+1) / 2;
			cnt++;
		}
		System.out.println(cnt);

	}

}
