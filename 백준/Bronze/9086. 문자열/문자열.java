import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String word[] = new String[number]; 
		char firstWord;
		char lastWord;
		
		for(int i=0;i<number;i++) {
			word[i]=scanner.next();
			firstWord=word[i].charAt(0);
			lastWord=word[i].charAt(word[i].length() - 1);
			System.out.println("" +firstWord+lastWord);//""을 앞에 붙여주기 (문자열 연결) 아니면 숫자로 인식함
		}
	}
}
