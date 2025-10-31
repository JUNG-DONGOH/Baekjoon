import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // 단어 개수 입력
        String[] word = new String[number];

        // 단어 입력
        for (int i = 0; i < number; i++) {
            word[i] = scanner.next();
        }

        int count = 0; // 그룹 단어 개수

        for (int i = 0; i < number; i++) {
            String w = word[i];

            boolean[] seen = new boolean[26]; // a~z 방문 기록 , 처음 생성할때는 기본값이 False임
            boolean isGroup = true;
            char prev = 0; // 이전 문자 (처음엔 아무 값 없음)

            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j); // word 배열 안의 하나의 단어(w)에서, 그 단어의 j번째 문자 하나를 꺼내서 c에 저장
                int idx = c - 'a'; // 문자를 정수형으로 변환

                // 이전 문자와 같으면 → 같은 블록이니까 무시하고 다음 문자로
                if (c == prev) continue;

                // 이전 문자와 다르다면 → 새로운 문자가 등장한 상황
                if (seen[idx]) { // 이미 나온 적 있는 문자라면
                    isGroup = false; // 그룹 단어 아님
                    break;            // 더 볼 필요 없음
                } else {
                    seen[idx] = true; // 처음 등장 → 체크 표시
                }

                prev = c; // 이전 문자 갱신
            }

            if (isGroup) count++; // 그룹 단어면 +1 , isGroup이 참이면
        }

        System.out.println(count);
        scanner.close();
    }
}
