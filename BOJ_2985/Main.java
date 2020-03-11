package BOJ_2985;

import java.util.*;
public class Main {
	static int a, b, c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a + b == c) {
			System.out.println(a+"+"+b+"="+c);
		}else if(a - b == c) {
			System.out.println(a+"-"+b+"="+c);
		}else if(a * b == c) {
			System.out.println(a+"*"+b+"="+c);
		}else if(a / b == c) {
			System.out.println(a+"/"+b+"="+c);
		}else if(a == b + c) {
			System.out.println(a+"="+b+"+"+c);
		}else if(a == b * c) {
			System.out.println(a+"="+b+"*"+c);
		}else if(a == b - c) {
			System.out.println(a+"="+b+"-"+c);
		}else if(a == b / c) {
			System.out.println(a+"="+b+"/"+c);
		}
		
		
	}
	
}
