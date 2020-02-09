package baekjoon;

import java.util.*;
public class Test_1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int first = 64;
		int cnt = 0;
		while(x > 0) {
			if(first > x) {
				first /= 2;
			}else {
				cnt++;
				x -= first;
			}
		}
		System.out.println(cnt);
		

	}

}
