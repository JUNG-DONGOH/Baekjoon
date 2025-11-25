import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // 문제 개수
        String s = sc.next();      // OX 문자열

        int bonus = 0;   // 연속 보너스
        int score = 0;   // 총 점수

        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);

            if (c == 'O') {
                score += (i + 1) + bonus;  // 문제 번호(i+1) + 현재 보너스
                bonus++;                   // 다음 문제를 위한 보너스 증가
            } else { // 'X'
                bonus = 0;                 // 보너스 초기화
            }
        }

        System.out.println(score);
        sc.close();
    }
}
