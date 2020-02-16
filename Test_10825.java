package baekjoon;

import java.util.*;
class Student implements Comparable<Student>{
	String name;
	int kor, eng, math;
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(this.kor > st.kor) {
			return -1;
		}else if(this.kor == st.kor) {
			if(this.eng < st.eng) {
				return -1;
			}else if(this.eng == st.eng) {
				if(this.math > st.math) {
					return -1;
				}else if(this.math == st.math) {
					return this.name.compareTo(st.name);
				}
			}
		}
		return 1;
	}

	
}
public class Test_10825 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Student> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			int score3 = sc.nextInt();
			list.add(new Student(s, score1, score2, score3));
		}

		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).name);
		}
		

	}

}
