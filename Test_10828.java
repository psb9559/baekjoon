package baekjoon;

import java.util.*;
public class Test_10828 {
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<=N+1;i++) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			if(st.countTokens() == 2) {
				String cmd = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				switch(cmd) {
					case "push":
						stack.push(num);
						break;
				}
			}else if(st.countTokens() == 1) {
				String cmd = st.nextToken();
				switch(cmd) {
					case "pop":
						if(!stack.isEmpty()) {
							System.out.println(stack.pop());
						}else {
							System.out.println(-1);
						}
						break;
					case "top":
						if(!stack.isEmpty()) {
							System.out.println(stack.peek());
						}else {
							System.out.println(-1);
						}
						break;
					case "size":
						System.out.println(stack.size());
						break;
					case "empty":
						if(stack.isEmpty()) {
							System.out.println(1);
						}else {
							System.out.println(0);
						}
						break;
				}
			}
			
		}

	}

}
