package baekjoon;

import java.util.*;
public class Test_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int sum = N/10 + N%10;
		int new_num = 10*(N%10) + sum%10;
		while(new_num != N) {
			sum = new_num/10 + new_num%10;
			new_num = 10*(new_num%10) + sum%10;
			cnt++;
		}
		System.out.println(cnt);

	}

}
