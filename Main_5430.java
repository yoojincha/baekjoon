import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_5430 {
	
	static int T,N;
	static String cmd,line;
	static String[] line2;
	static int s,e;
	static char c;
	static boolean removable;
	static boolean orderPro;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			orderPro = true;
			cmd = br.readLine(); // 명령어
			N = Integer.parseInt(br.readLine()); // 배열의 크기
			s = 0;
			e = N-1;
			line = br.readLine();
			line = line.substring(1, line.length()-1);
			line2 = line.split(","); // 배열
			removable = true;
			for (int i = 0; i < cmd.length(); i++) {
				if (removable == false) break;
				switch(cmd.charAt(i)) {
				case 'R': //뒤집기
					if(orderPro) {
						orderPro = false;
					} else orderPro = true;
					break;
				case 'D': //버리기
					if(!deleteFirst()) System.out.println("error");;
					break;
				}
			}
			if (removable == true) {
				printList(line2);
			}
		}
	}

	private static void printList(String[] li) {
		System.out.print("[");
		if(orderPro) {
			for (int i = s; i < e; i++) {
				System.out.print(line2[i]+",");
			}
			if(s<=e)System.out.print(line2[e]);
		} else {
			for (int i = e; i > s; i--) {
				System.out.print(line2[i]+",");
			}
			if(s<=e)System.out.print(line2[s]);
		}
		System.out.println("]");
	}

	private static boolean deleteFirst() {
		if(N==0) {
			removable = false;
		} else {
			if (orderPro) s++;
			else e--;
			N--;
		}
		return removable;
	}
}