package baekjoon;

import java.util.*;
public class Test_5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();//���� ��������
		int b = sc.nextInt();//���� ��������
		int c = sc.nextInt();//�Ϸ� ���� Ǫ�¾�
		int d = sc.nextInt();//�Ϸ� ���� Ǫ�¾�
		
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
