import java.util.Scanner;

public class Main_11051 {
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		arr = new int[N+1][K+1];
		System.out.println(go(N,K));
	}
	private static int go(int n, int k) {
		if(arr[n][k] > 0) return arr[n][k];
		if(n==k || k==0) return arr[n][k] = 1;
		return arr[n][k] = (go(n-1,k-1) + go(n-1,k)) % 10007;
	}
}
