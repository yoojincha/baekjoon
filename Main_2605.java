import java.util.LinkedList;
import java.util.Scanner;

public class Main_B2_2605_줄세우기 {
	static int N;
	static int num;
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) { // 학생의 번호 i
			num = sc.nextInt(); // 각 학생들이 앞으로 움직일 칸의 수
			list.add(i-1-num, i);
		}
		for (int i = 0; i < N; i++) {
			System.out.print(list.get(i)+" ");
		}
		sc.close();
	}
}
