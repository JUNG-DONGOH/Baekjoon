import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] arr = new char[5][15];

        // 기본 초기값은 '\0' (null 문자)
        // 입력받기
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // 세로 읽기
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != '\0') { // 해당 칸에 문자가 있으면 출력
                    System.out.print(arr[i][j]);
                }
            }
        }

        scanner.close();
    }
}
