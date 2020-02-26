package baekjoon;

import java.util.*;
public class Test_17252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		if(N == 0) {
			System.out.println("NO");
			return;
		}
		while(N > 0) {
			if(N % 3 == 2) {
				System.out.println("NO");
				return;
			}
			N /= 3;
		}
	
		System.out.println("YES");
		

	}

}
