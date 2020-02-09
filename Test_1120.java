package baekjoon;

import java.util.*;
public class Test_1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int min = Integer.MAX_VALUE;
		int result = min;
		for(int i=0;i<=c2.length-c1.length;i++) {
			int cnt = 0;
			for(int j=0;j<c1.length;j++) {
				if(c1[j] != c2[j+i]) {
					cnt++;
				}
			}
			result = Math.min(result, cnt);			
		}
		System.out.println(result);
	

	}

}
