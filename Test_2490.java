package baekjoon;

import java.util.*;
public class Test_2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=3;tc++) {
			int[] cnt = new int[2];
			int[] map = new int[4];
			for(int i=0;i<map.length;i++) {
				map[i] = sc.nextInt();
				cnt[map[i]]++;
			}
			if(cnt[0] == 1 && cnt[1] == 3) {
				System.out.println("A");
			}else if(cnt[0] == 2 && cnt[1] == 2) {
				System.out.println("B");
			}else if(cnt[0] == 3 && cnt[1] == 1) {
				System.out.println("C");
			}else if(cnt[0] == 4 && cnt[1] == 0) {
				System.out.println("D");
			}else if(cnt[0] == 0 && cnt[1] == 4) {
				System.out.println("E");
			}
		}

	}

}
