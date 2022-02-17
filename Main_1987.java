import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_1987_알파벳 {
	static int R, C;
	static char[][] map;
	static int[] v = new int[26];
	static int[] dr = {0,0,1,-1};
	static int[] dc = {1,-1,0,0};
	static int cnt;
	static int max;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		max = Integer.MIN_VALUE;
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		dfs(0,0);
		System.out.println(max);
	}
	private static void dfs(int x, int y) {
		int idx = map[x][y] - 'A';
		if(v[idx] > 0) return;
		else {
			v[idx]++;
			cnt++;
			max = Math.max(max, cnt);
			for(int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if(nr < 0 || nr >= R || nc < 0 || nc >= C) continue;
				dfs(nr,nc);
			}
			v[idx]--;
			cnt--;
		}
	}
}
