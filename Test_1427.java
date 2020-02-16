package baekjoon;

import java.util.*;
public class Test_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i) - '0';
		}
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

	}

}
