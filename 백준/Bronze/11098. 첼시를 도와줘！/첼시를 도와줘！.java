import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 테스트케이스 수

		while (N-- > 0) {
		    int p = scanner.nextInt(); // 각 케이스별 선수 수

		    int[] prices = new int[p];
		    String[] names = new String[p];

		    for (int i = 0; i < p; i++) {
		        prices[i] = scanner.nextInt();
		        names[i] = scanner.next();
		    }

		    int max = 0;
		    String maxName = "";

		    // 가장 비싼 선수 찾기
		    for (int i = 0; i < p; i++) {
		        if (prices[i] > max) {
		            max = prices[i];
		            maxName = names[i];
		        }
		    }

		    System.out.println(maxName);
		}

	}

}
