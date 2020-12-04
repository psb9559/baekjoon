package GS코테연습;

import java.util.*;

public class BOJ_14647 {
	static int r, c;
	static int[][] bingo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		bingo = new int[r][c];
		
		int nine_cnt = 0;
		int row_max = 0, col_max = 0;
		for(int i=0;i<r;i++) {
			int colSum = 0;
			for(int j=0;j<c;j++) {
				int tmp = sc.nextInt();
				bingo[i][j] = findNine(tmp);
				colSum += bingo[i][j];
				nine_cnt += bingo[i][j];
			}
			col_max = Math.max(col_max, colSum);
		}
		
		for(int i=0;i<c;i++) {
			int rowSum = 0;
			for(int j=0;j<r;j++) {
				rowSum += bingo[j][i];
			}
			row_max = Math.max(row_max, rowSum);
		}
		
		System.out.println(nine_cnt - Math.max(row_max, col_max));
		

	}
	
	private static int findNine(int num) {
		int result = 0;
		while(num != 0) {
			if(num % 10 == 9) {
				result++;
			}
			num /= 10;
		}
		return result;
	}

}
