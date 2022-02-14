import java.util.Scanner;

public class Main_B2_3040_백설공주와일곱난쟁이 {
	static int[] dwarves = new int[9];
	static int liars = -100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			dwarves[i] = sc.nextInt();
			liars += dwarves[i];
		}
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 9; j++) {
				if(dwarves[i]+dwarves[j] == liars) {
					for (int k = 0; k < 9; k++) {
						if(!(k==i || k==j)) System.out.println(dwarves[k]);
					}
					break;
				}
			}
		}
	}
}