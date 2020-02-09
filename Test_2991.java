package baekjoon;

import java.util.*;
public class Test_2991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int[] person = new int[3];
		for(int i=0;i<person.length;i++) {
			person[i] = sc.nextInt();
		}
		for(int i=0;i<person.length;i++) {
			int cnt = 0;
			int point1 = person[i] % (a+b);
			int point2 = person[i] % (c+d);
			if(point1 > 0 && point1 <= a) {
				cnt++;
			}
			if(point2 > 0 && point2 <= c) {
				cnt++;
			}
			System.out.println(cnt);
			
			
		}
		
		
		
		

	}

}
