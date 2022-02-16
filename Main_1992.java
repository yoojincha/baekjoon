import java.util.Scanner;

public class Main_S1_1992_쿼드트리 {
	static int N;
	static char[][] map;
	static String S = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new char[N][N];
		for (int i = 0; i < N; i++) {
			char[] cs = sc.next().toCharArray();
			for (int j = 0; j < N; j++) {
				map[i][j] = cs[j];
			}
		}
		compress(0,0,N);
		System.out.println(S);
	}
	private static void compress(int x, int y, int n) {
		int[] dx = {0, 0, n/2, n/2};
		int[] dy = {0, n/2, 0, n/2};
		char standard = map[x][y]; // 1 or 0 기준
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(standard != map[x+i][y+j]) { // 기준과 다를때
					S += "(";
					flag = true;
					for (int d = 0; d < 4; d++) {
						compress(x+dx[d],y+dy[d],n/2);
					}
					S += ")";
					break;
				}
			}
			if(flag == true) break;
		}
		if(flag == false) S += standard;
	}
}
