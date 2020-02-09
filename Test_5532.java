package baekjoon;

import java.util.*;
public class Test_5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();//국어 총페이지
		int b = sc.nextInt();//수학 총페이지
		int c = sc.nextInt();//하루 국어 푸는양
		int d = sc.nextInt();//하루 수학 푸는양
		
		int result = 0;
		int cnt1 = a / c;
		int cnt2 = b / d;
		if(cnt1 > cnt2) {
			if(a % c == 0) {
				result = l - cnt1;
			}else {
				result = l - (cnt1+1);
			}
		}else {
			if(b % d == 0) {
				result = l - cnt2;
			}else {
				result = l - (cnt2+1);
			}
		}
		System.out.println(result);

	}

}
