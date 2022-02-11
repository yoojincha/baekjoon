import java.util.Scanner;
import java.util.Stack;

public class Main_S4_9012_괄호 {
	static int T;
	static String line;
	static Stack<Character> stack;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			stack = new Stack<>();
			n = 0;
			line = sc.next();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if(c=='(') {
					stack.add(c);
					n++;
				} else {
					if(n==0 || stack.peek()==')'){
						stack.add('.');
						break;
					}
					else{
						stack.pop();
						n--;
					}
				}
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
