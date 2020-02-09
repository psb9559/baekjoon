package baekjoon;

import java.util.*;
public class Test_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] s_list = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			s = s.replace(s_list[i], "a");
		}
		
		System.out.println(s.length());
		
	}

}
