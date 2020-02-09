package baekjoon;

import java.util.*;
public class Test_11652ver2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = Long.MAX_VALUE;
		int max_cnt = 0;
		HashMap<Long, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			long num = sc.nextLong();
			int cnt = map.getOrDefault(num, 0) + 1;
			System.out.println(num + " "+ cnt);
			if(cnt > max_cnt) {
				result = num;
				max_cnt = cnt;
			}else if(cnt == max_cnt && result > num){
				result = num;
				max_cnt = cnt;
			}
			map.put(num, cnt);
	
		}
		
		System.out.println(result);
	}

}
