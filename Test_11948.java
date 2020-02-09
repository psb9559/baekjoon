package baekjoon;

import java.util.*;
public class Test_11948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] science = new int[4];
		int[] social = new int[2];
		
		for(int i=0;i<4;i++) {
			science[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			social[i] = sc.nextInt();
		}
		Arrays.sort(science);
		Arrays.sort(social);
		
		int sum1 = 0, sum2 = social[1];
		for(int i=1;i<4;i++) {
			sum1 += science[i];
		}
		System.out.println((sum1 + sum2));

	}

}
