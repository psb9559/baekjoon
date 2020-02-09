package baekjoon;

import java.util.*;
public class Test_10797 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<5;i++) {
			int test = sc.nextInt();
			if(test == n) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
