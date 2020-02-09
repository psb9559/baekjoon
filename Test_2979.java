package baekjoon;

import java.util.Scanner;

public class Test_2979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] check = new int[101];
		for(int i=0;i<3;i++) {
			int p_in = sc.nextInt();
			int p_out = sc.nextInt();
			for(int j=p_in;j<=p_out-1;j++) {
				check[j]++;
			}
		}
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(check[i] == 1) {
				sum += a;
			}else if(check[i] == 2) {
				sum += (b * check[i]);
			}else if(check[i] == 3) {
				sum += (c * check[i]);
			}else {
				continue;
			}
		}
		
		System.out.println(sum);

	}

}
