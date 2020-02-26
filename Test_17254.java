package baekjoon;

import java.util.*;
class KeyBoard{
	int num, sec;
	char ch;
	KeyBoard(int num, int sec, char ch){
		this.num = num;
		this.sec = sec;
		this.ch = ch;
	}
}
public class Test_17254 {
	static int N, M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		ArrayList<KeyBoard> list = new ArrayList<>();
		for(int i=0;i<M;i++) {
			int k_num = sc.nextInt();
			int k_sec = sc.nextInt();
			char msg = sc.next().charAt(0);
			list.add(new KeyBoard(k_num, k_sec, msg));
		}
		Collections.sort(list, new Comparator<KeyBoard>() {

			@Override
			public int compare(KeyBoard k1, KeyBoard k2) {
				if(k1.sec > k2.sec) {
					return 1;
				}else if(k1.sec < k2.sec) {
					return -1;
				}else if(k1.sec == k2.sec) {
					if(k1.num > k2.num) {
						return 1;
					}else {
						return -1;
					}
				}
				return 0;
			}
			
		});
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).ch);
		}
		System.out.println();

	}

}
