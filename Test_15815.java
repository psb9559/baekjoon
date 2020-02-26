package baekjoon;
import java.util.*;
public class Test_15815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> st1 = new Stack<Character>();
		Stack<Integer> st2 = new Stack<Integer>();
		String tmp = sc.next();
		for(int i=0;i<tmp.length();i++) {
			char c = tmp.charAt(i);
			if(Character.isDigit(c)) {
				st2.push(tmp.charAt(i) - '0');
			}else {
				int b = st2.pop();
				int a = st2.pop();
				switch(c) {
				case '+':
					st2.push(a+b);
					break;
				case '-':
					st2.push(a-b);
					break;
				case '*':
					st2.push(a*b);
					break;
				case '/':
					st2.push(a/b);
					break;
				}
				
			}
			
			
		}
		System.out.println(st2.pop());

	}

}
