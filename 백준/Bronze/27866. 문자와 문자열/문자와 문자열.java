import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine(); //문자열 받기
		int number = scanner.nextInt(); //문자열의 몇번째인지 받기
		char c = string.charAt(number-1);   //charAt을 이용
		System.out.println(c);  //출력

	}

}
