package baekjoon;

import java.util.*;
public class Test_10886 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] person = new int[n];
		int[] cute = new int[2];
		for(int i=0;i<n;i++) {
			person[i] = sc.nextInt();
			cute[person[i]]++;
		}
		if(cute[0] > cute[1]) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}

	}

}
