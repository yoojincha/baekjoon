import java.util.Scanner;

public class Main_S1_2961_도영이가만든맛있는음식 {
	static int N;
	static int[][] taste;
	static int diff;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		taste = new int[N][2];
		for (int i = 0; i < N; i++) {
			taste[i][0] = sc.nextInt();
			taste[i][1] = sc.nextInt();
		}
		diff = Integer.MAX_VALUE;
		subset(0,1,0);
		System.out.println(diff);
	}

	private static void subset(int cnt, int sweet, int bitter) {
		if(cnt==N) {
			if(bitter == 0) return;
			diff = Math.min(diff,  Math.abs(sweet-bitter));
			return;
		}
		subset(cnt+1,sweet*taste[cnt][0],bitter+taste[cnt][1]);
		subset(cnt+1,sweet,bitter);
	}
}
