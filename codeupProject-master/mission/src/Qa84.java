import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Qa84

{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int count = 0;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int j2 = 0; j2 < c; j2++) {
					bw.write(i+" "+j+" "+j2+"\n");
					count++;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		
	}
}

