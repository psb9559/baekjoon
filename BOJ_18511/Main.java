package BOJ_18511;
import java.util.*;
public class Main {
	static int[] arr;
	static int[] sel;
	static int N, K, ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		String tmp = Integer.toString(N);
		arr = new int[K];
		ans = 0;
		for(int i=0;i<K;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1;i<=tmp.length();i++) {
			sel = new int[i];
			perm(0);
		}
		System.out.println(ans);
	}
	static void perm(int idx) {
		if(idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i] * Math.pow(10, (sel.length-1)-i);
			}
			System.out.println(sum);
			if(sum > N) {
				return;
			}
			ans = Math.max(ans, sum);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			sel[idx] = arr[i];
			perm(idx+1);
		}
	}
}
