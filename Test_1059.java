package baekjoon;

import java.util.*;
public class Test_1059 {
	static int l, n, start, end, ans;
	static int[] lucky;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		lucky = new int[l];
		for(int i=0;i<l;i++) {
			lucky[i] = sc.nextInt();
		}
		Arrays.sort(lucky);
		n = sc.nextInt();
		for(int i=0;i<lucky.length-1;i++) {
			if(lucky[i] < n && n < lucky[i+1]) {
				start = lucky[i]+1;
				end = lucky[i+1]-1;
				break;
			}
		}
		if(start == 0 && end == 0) {
			if(n < lucky[0]) {
				start = 1;
				end = lucky[0] - 1;
			}
		}
		
		if(start != 0 && end != 0) {
			ans = (end-n+1) * (n-start) + (end-n);
		}
		System.out.println(ans);
	}

}
