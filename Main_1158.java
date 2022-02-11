import java.util.ArrayList;
import java.util.Scanner;

public class Main_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> origin = new ArrayList<>();
		ArrayList<Integer> yosep = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			origin.add(i);
		}
		int k = 0;
		while(!origin.isEmpty()) {
			k = (K+k-1)%origin.size();
			yosep.add(origin.get(k));
			origin.remove(k);
		}
		System.out.print("<");
		for (int i = 0; i < yosep.size()-1; i++) {
			System.out.print(yosep.get(i)+", ");
		}
		System.out.println(yosep.get(yosep.size()-1)+">");
	}

}
