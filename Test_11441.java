package baekjoon;

import java.util.*;
public class Test_11441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
		}
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			int sum = 0;
			for(int j=left;j<=right;j++) {
				sum += arr[j];
			}
			System.out.println(sum);
		}
		

	}

}
