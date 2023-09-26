import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX6_ArrayRain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayRain = new int[12];
		
		System.out.println("雨天の日数を入力");
		for(int i = 0; i < arrayRain.length; i++) {
			System.out.print((i + 1) + "月？>");
			arrayRain[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println();
		System.out.println("雨天の日数グラフ");
		for(int i = 0; i < arrayRain.length; i++) {
			if(i < 9) {
				System.out.print(" " + (i + 1) + "月 ");
			} else {
				System.out.print((i + 1) + "月 ");
			}
			System.out.print("*".repeat(arrayRain[i]));
			System.out.println(" " + arrayRain[i]);
		}
	}
}