package baekjoon;

import java.util.*;
public class Test_9012 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			Stack<Character> stack = new Stack<>();
			boolean flag = false;
			for(int j=0;j<s.length();j++) {
				char tmp = s.charAt(j);
				if(tmp == '(') {
					stack.push(tmp);
				}else if(tmp == ')') {
					if(!stack.isEmpty()) {
						stack.pop();
					}else {
						flag = true;
					}
				}
			}
			
			if(!stack.isEmpty()) {
				flag = true;
			}
			if(flag) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}

}
