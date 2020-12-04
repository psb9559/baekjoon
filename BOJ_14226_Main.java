package GS코테연습;


import java.util.*;

public class BOJ_14226_Main {
	static int S;
	static boolean[][] check;
	static class Imoticon{
		int len, buf, count;
		public Imoticon(int len, int buf, int count) {
			this.len = len;
			this.buf = buf;
			this.count = count;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		check = new boolean[2002][2002];

		System.out.println(bfs());
	}

	private static int bfs(){
		Queue<Imoticon> queue = new LinkedList<>();
		check[1][0] = true;
		queue.add(new Imoticon(1, 0, 0));
		while(!queue.isEmpty()) {
			Imoticon imo = queue.poll();
			if(imo.len == S) {
				return imo.count;
			}
			if(!check[imo.len][imo.len]) { // 이모티콘 복사
				check[imo.len][imo.len] = true;
				queue.add(new Imoticon(imo.len, imo.len, imo.count + 1));
			}
			if(imo.buf != 0 && !check[imo.len+imo.buf][imo.buf] && imo.len + imo.buf <= 1000) {
				check[imo.len+imo.buf][imo.buf] = true;
				queue.add(new Imoticon(imo.len+imo.buf, imo.buf, imo.count + 1));
			}
			if(imo.len > 0 && !check[imo.len-1][imo.buf]) {
				check[imo.len-1][imo.buf] = true;
				queue.add(new Imoticon(imo.len - 1, imo.buf, imo.count + 1));
			}
			
			
		}
		return -1;
		
	}
}
