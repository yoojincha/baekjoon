import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_S4_10828_스택 {

	static int N;
	static String cmd;
	static Stack<Integer> stack = new Stack<Integer>();
	static int cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				cmd = st.nextToken();
				switch(cmd) {
				case "push":
					int x = Integer.parseInt(st.nextToken());
					stack.add(x);
					cnt++;
					break;
				case "pop":
					if(cnt == 0) System.out.println(-1);
					else {
						System.out.println(stack.peek());
						stack.pop();
						cnt--;
					}
					break;
				case "size":
					System.out.println(cnt);
					break;
				case "empty":
					if(cnt == 0) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					if(cnt == 0) System.out.println(-1);
					else System.out.println(stack.peek());
					break;
				}
			}
		}
		

	}

}
