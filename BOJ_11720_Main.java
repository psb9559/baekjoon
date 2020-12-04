package GS코테연습;


import java.util.*;

public class BOJ_11720_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		String str = sc.next();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			result += ch[i] - '0';
		}
		System.out.println(result);

	}

}
