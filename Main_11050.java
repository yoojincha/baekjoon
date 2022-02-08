import java.util.Scanner;

public class Main_11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = sc.nextInt();
		int cnt = 0;
		// 공식 : nCr = n! / (n-r)!r!
		System.out.println(getNCR(N,R));

	}

	private static int getNCR(int n, int r) {
		if(r==0 || r==n) return 1;
		return getNCR(n-1,r-1) + getNCR(n-1,r);
	}
}
