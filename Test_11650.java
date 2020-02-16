package baekjoon;

import java.util.*;

public class Test_11650 {
	static class Dot{
		int x, y;
		Dot(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Dot> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Dot(a, b));
		}
		Collections.sort(list, new Comparator<Dot>() {

			@Override
			public int compare(Dot d1, Dot d2) {
				// TODO Auto-generated method stub
				if(d1.x < d2.x) {
					return -1;
				}else if(d1.x > d2.x) {
					return 1;
				}else if(d1.x == d2.x) {
					if(d1.y < d2.y) {
						return -1;
					}else if(d1.y >= d2.y) {
						return 1;
					}
				}
				return 0;
			}
			
		});
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).x + " " + list.get(i).y);
		}

	}

}
