import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 자료형이 int는 범위를 넘기때문에 Long을 써줌
		try {
			long A = scanner.nextLong();
			long B = scanner.nextLong();
			long C = scanner.nextLong();
			long result = A + B + C;
			System.out.print(result);
		} catch (InputMismatchException e) {
			return;
		}
	}
}

