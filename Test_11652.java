package baekjoon;

import java.util.*;
public class Test_11652 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] card = new long[n];
		for(int i=0;i<n;i++) {
			card[i] = sc.nextLong();
			
		}
		if(n == 1) {
			System.out.println(card[0]);
			return;
		}
		Arrays.sort(card);
		long ans = 0;
		int cnt = 1, max_cnt = 0;
		for(int i=0;i<n-1;i++) {
			if(card[i] == card[i+1]) {
				cnt++;
			}else if(i == n-2) {
				if(card[i] == card[i+1]) {
					cnt++;
				}
				if(max_cnt < cnt) {
					max_cnt = cnt;
					ans = card[i];
					cnt = 1;
				}else if(max_cnt == cnt) {
					if(ans > card[i]) {
						ans = card[i];
					}
				}
			}else {
				if(max_cnt < cnt) {
					max_cnt = cnt;
					ans = card[i];
					cnt = 1;
				}else if(max_cnt == cnt) {
					if(ans > card[i]) {
						ans = card[i];
					}
					max_cnt = cnt;
					cnt = 1;
				}else {
					cnt = 1;
				}
			}
		}
		System.out.println(ans);


	}

}
