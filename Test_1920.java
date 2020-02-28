package baekjoon;
import java.util.*;
public class Test_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> list = new HashSet<>();
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0;i<m;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			if(list.contains(arr[i])) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		

	}

}
