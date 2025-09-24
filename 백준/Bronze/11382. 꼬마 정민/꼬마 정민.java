import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

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
