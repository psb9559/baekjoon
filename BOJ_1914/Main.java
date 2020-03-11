package BOJ_1914;
import java.math.*;
import java.util.*;
public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		BigInteger b = new BigInteger("2");
		BigInteger ans = b.pow(N).subtract(BigInteger.ONE);
		System.out.println(ans);
		if(N <= 20) {
			hanoi(N, 1, 2, 3);
		}
	}
	static void hanoi(int cnt, int from, int tmp, int to) {
		if(cnt == 1) {
			System.out.println(from + " " + to);
			return;
		}else {
			hanoi(cnt-1, from, to, tmp);
			System.out.println(from + " " + to);
			hanoi(cnt-1, tmp, from, to);
		}
		
	}

}
