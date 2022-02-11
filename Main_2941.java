import java.util.Scanner;

public class Main_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int cnt = 0;
		if(line.length()==1) System.out.println(1);
		else {
			for (int i = 0; i < line.length(); i++) {
				char x = line.charAt(i);
				if(x == '=' || x == '-') continue;
				if(x == 'l' || x == 'n') {
					if(i<line.length()-1) {
						char y = line.charAt(i+1);
						if((y == 'j' && (x == 'l' || x == 'n')) || y == 'z' && x == 'd') continue;
					}
				}
				if(x == 'd') {
					if(i<line.length()-2) {
						char y = line.charAt(i+1);
						char z = line.charAt(i+2);
						if(y == 'z' && z == '=') continue;
					}
				}
				cnt++;
			}
			System.out.println(cnt);
		}

	}

}
