import java.util.Scanner;

public class Main_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	
		int cnt = 0;
		for (int t = 0; t < T; t++) {
			boolean[] alpha = new boolean[26];
			String word = sc.next();
			int now = word.charAt(0)-97;
			cnt++;
			alpha[now] = true;
			for (int i = 1; i < word.length(); i++) {
				int idx = word.charAt(i)-97;
				if(alpha[idx] == false) {
					alpha[idx] = true;
					now = idx;
				}
				else if(idx != now && alpha[idx]==true) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
