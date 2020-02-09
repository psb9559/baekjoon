package baekjoon;

import java.util.*;
public class Test_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] person = new int[31];
		int[] hw = new int[2];
		for(int i=1;i<=28;i++) {
			int num = sc.nextInt();
			person[num]++;
		}
		int k = 0;
		for(int i=1;i<=30;i++) {
			if(person[i] != 1) {
				hw[k++] = i;
			}
		}
		for(int i=0;i<2;i++) {
			System.out.println(hw[i]);
		}
		

	}

}
