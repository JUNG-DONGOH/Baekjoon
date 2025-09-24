import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(); //세자리수 1번
		int b = scanner.nextInt(); //세자리수 2번
		
		int result3 = a*(b%10); //3번째 값
		int result4 = a*((b/10)%10); //4번째 값
		int result5 = a*(b/100); //5번째 값
		int mainResult = result3+(result4*10)+(result5*100); //6번째 값
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(mainResult);
	}
}
