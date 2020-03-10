package BOJ_2644;

import java.util.*;
public class Main {
	static int N, M, A, B;
	static int[][] arr;
	static int[] total;
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N+1][2];
		visit = new boolean[N+1];
		total = new int[N+1];
		for(int i=1;i<=M;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		System.out.println(bfs(A, N));
		
	}
	static int bfs(int x, int N) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		while(!queue.isEmpty()) {
			int nx = queue.poll();
			visit[nx] = true;
			for(int i=0;i<N;i++) {
				if(arr[i][0] == nx && !visit[arr[i][1]]) {
					queue.add(arr[i][1]);
					total[arr[i][1]] = total[arr[i][0]] + 1;
				}else if(arr[i][1] == nx && !visit[arr[i][0]]) {
					queue.add(arr[i][0]);
					total[arr[i][0]] = total[arr[i][1]] + 1;
				}
			}
			if(!queue.isEmpty() && queue.peek() == B) {
				return total[B];
			}
		}
		return -1;
	}

}
