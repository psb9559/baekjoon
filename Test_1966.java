package baekjoon;

import java.util.*;
public class Test_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			Queue<Integer> q = new LinkedList<>();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int max = 0;
			for(int i=0;i<n;i++) {
				int num = sc.nextInt();
				if(num > max) {
					max = num;
				}
				map.put(i, num);
				q.add(num);
			}
			while(!q.isEmpty()) {
				if(q.peek() >= max) {
					q.poll();
					max -= 1;
				}
			}
			
			
		}

	}

}
