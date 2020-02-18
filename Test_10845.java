package baekjoon;

import java.util.*;
public class Test_10845 {
	static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		int rear = 0;
		for(int i=1;i<=N+1;i++) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			if(st.countTokens() == 2) {
				String cmd = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				rear = num;
				switch(cmd) {
					case "push":
						queue.add(num);
						break;
				}
			}else if(st.countTokens() == 1) {
				String cmd = st.nextToken();
				switch(cmd) {
					case "pop":
						if(!queue.isEmpty()) {
							System.out.println(queue.poll());
						}else {
							System.out.println(-1);
						}
						break;
					case "front":
						if(!queue.isEmpty()) {
							System.out.println(queue.peek());
						}else {
							System.out.println(-1);
						}
						break;
					case "back":
						if(!queue.isEmpty()) {
							System.out.println(rear);
						}else {
							System.out.println(-1);
						}
						break;
					case "size":
						System.out.println(queue.size());
						break;
					case "empty":
						if(queue.isEmpty()) {
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
