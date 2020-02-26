package baekjoon;

import java.util.*;
public class Test_17245 {
	static int N, MAX_height, time;
	static long com_cnt, half_com;
	static int[] h_list; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		h_list = new int[10000001];
		MAX_height = 0;
		com_cnt = 0;
		time = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int height = sc.nextInt();
				MAX_height = Math.max(MAX_height, height);
				h_list[height]++;
				com_cnt += height;
			}
		}
		half_com = com_cnt / 2;
		if(com_cnt % 2 == 1) {
			half_com++;
		}
		long tmp = com_cnt;
		for(int i=MAX_height;i>0;i--) {
			if(tmp < half_com) {
				time = i+1;
				break;
			}else if(tmp == half_com || i == 1) {
				time = i;
				break;
			}
			tmp -= h_list[i];
			h_list[i-1] += h_list[i];
		}
		System.out.println(time);
		
		
	}

}
