import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S5_11723_집합 {
	static int M;
	static int bitset = 0;
	static String[] cmd = new String[2];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = 0;
			while(st.hasMoreTokens()) {
				cmd[idx++] = st.nextToken();
			}
			switch(cmd[0]) {
			case "add":
				bitset |= 1<<(Integer.parseInt(cmd[1])-1);
				break;
			case "remove":
				bitset &= ~(1<<(Integer.parseInt(cmd[1])-1));
				break;
			case "check":
				sb.append((bitset & 1<<(Integer.parseInt(cmd[1])-1)) == 0 ? "0\n": "1\n");
				break;
			case "toggle":
				bitset ^= 1<<(Integer.parseInt(cmd[1])-1);
				break;
			case "all":
				bitset |= ~0;
				break;
			case "empty":
				bitset = 0;
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
