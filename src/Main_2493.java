import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2493 {
	static int N;
	static int height;
	static int ans;
	static Stack<int[]> stack = new Stack<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			height = Integer.parseInt(st.nextToken());
			while(!(stack.isEmpty())) {
				ans = 0;
				if(stack.peek()[0] >= height) {
					ans = stack.peek()[1];
					break;
				} else {
					stack.pop();
				}
			}
			stack.push(new int[] {height,i+1});
			System.out.print(ans + " ");
		}
	}
}
