package baekjoon;

import java.util.*;
public class Test_5543 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ham = new int[3];
		int[] cola = new int[2];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			ham[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			cola[i] = sc.nextInt();
		}
		for(int i=0;i<ham.length;i++) {
			for(int j=0;j<cola.length;j++) {
				int sum = ham[i] + cola[j];
				min = Math.min(sum, min);
			}
		}
		System.out.println((min-50));

	}
	

}
