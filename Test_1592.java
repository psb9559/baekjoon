package baekjoon;

import java.util.*;
public class Test_1592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int cnt = 0;
		int[] person = new int[n+1];
		person[1] = 1;
		int idx = 1;
		while(person[idx] != m) {
			if(person[idx] % 2 == 1) {
				idx += l;
				if(idx > n) {
					idx -= n;
				}
			}else {
				idx -= l;
				if(idx <= 0) {
					idx += n;
				}
			}
			person[idx]++;
			cnt++;
		}
		System.out.println(cnt);
		

	}

}
