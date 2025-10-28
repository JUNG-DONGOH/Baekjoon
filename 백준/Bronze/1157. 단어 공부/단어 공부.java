import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toUpperCase();

        int[] count = new int[26];  // A~Z 카운트

        // 문자 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'A']++;
        }

        // 최대값 찾기
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max)
                max = count[i];
        }

        // 최댓값 중복 확인
        int maxIndex = -1;
        int same = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                maxIndex = i;
                same++;
            }
        }

        // 출력
        if (same > 1)
            System.out.println("?");
        else
            System.out.println((char)(maxIndex + 'A'));
    }
}
