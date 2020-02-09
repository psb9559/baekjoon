package baekjoon;

import java.util.*;
public class Test_2798 {
	static int n, m;
	static int[] card;
	static int MAX = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		card = new int[n];
		for(int i=0;i<n;i++) {
			card[i] = sc.nextInt();		
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int sum = card[i]+card[j]+card[k];
					if(sum > MAX && sum <= m) {
						MAX = sum;
					}
				}
			}
		}
		System.out.println(MAX);

	}
	
}
