package baekjoon;

import java.util.*;
public class Test_15814 {
	static int T;
	static char[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		arr = new char[tmp.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = tmp.charAt(i);
		}
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			swap(a, b);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	static void swap(int a, int b) {
		char tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		
	}

}
