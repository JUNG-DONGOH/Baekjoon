import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long S = 0;      // 전체 높이 합
        long T = 0;      // 가능한 +2의 최대 개수 합 (h/2)

        for (int i = 0; i < N; i++) {
            int h = scanner.nextInt();
            S += h;
            T += h / 2;
        }

        // 1) 전체 높이 합이 3의 배수가 아니면 불가능
        if (S % 3 != 0) {
            System.out.print("NO");
            return;
        }

        // 2) +2를 최소 S/3번 이상 쓸 수 있어야 가능
        if (T >= S / 3) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}


① import java.util.Scanner;

Java에서 사용자 입력을 받기 위한 Scanner 클래스를 가져오는 구문.

② public class Main {

백준에서 자바는 반드시 클래스 이름이 Main이어야 한다.

③ public static void main(String[] args) {

자바 프로그램의 시작점.

④ Scanner scanner = new Scanner(System.in);

표준 입력(System.in = 키보드 입력)을 받아들이는 Scanner 객체 생성.
백준은 입력이 stdin으로 들어오기 때문에 이렇게 읽는다.

⑤ int N = scanner.nextInt();

문제에서 주어지는 “나무의 개수 N”을 입력받는다.

⑥ long S = 0;

전체 높이 합을 저장할 변수.

왜 long?

h_i 최대 10^9

N 최대 100,000

최악의 경우 S = 10^9 × 10^5 = 10^14
int(21억)을 넘기 때문에 long 필요.

⑦ long T = 0;

모든 나무가 받을 수 있는 +2 물주기 최대 횟수의 합.

왜 long?

h/2를 N번 더하므로 대략 S/2 수준 → long 필요.

⑧ for (int i = 0; i < N; i++) {

모든 나무의 높이를 입력받기 위해 N번 반복.

⑨ int h = scanner.nextInt();

각 나무의 최종 목표 높이 h_i 입력.

⑩ S += h;

전체 높이 합 S에 현재 나무의 높이를 더한다.

왜 필요한가?

이 문제의 핵심은 전체 증가량이 2x + y = S 형태가 되어야 하기 때문.
따라서 전체 S가 3의 배수가 되어야 하고,
S/3개의 3묶음(2+1)을 만들어야 한다.

⑪ T += h / 2;

여기가 진짜 핵심❗❗

“이 나무가 +2를 몇 번 받을 수 있는가?”를 계산하는 부분.

+2를 k번 준다는 건 “그 나무를 한 번에 2씩 k번 올린다”는 뜻

하지만 나무 높이는 h까지만 가능

따라서 2k ≤ h → k ≤ h/2

즉, 최대 ⌊h/2⌋ 번 가능

Java에서 h / 2는 자동으로 ⌊h/2⌋

이걸 모든 나무에 대해 더하면
→ 전체 +2의 최대 사용 가능 횟수 = T

이게 문제에서 말하는 “전체 여유도” 같은 개념이다.

⑫ if (S % 3 != 0) {

전체 높이 합 S가 3의 배수가 아니면 절대 불가능.

왜?

전체 증가량은 반드시
S = 2x + y
형태인데

2x + y는

3으로 나누면

(2x + y) % 3 = (2x % 3 + y % 3)
즉 특정 조합으로만 나옴.

결국 S를 3묶음(2+1) 형태로 만들려면
S가 반드시 3으로 나누어 떨어져야 함.

⑬ System.out.print("NO"); return;

3의 배수가 아니면 바로 NO 출력하고 종료.

⑭ if (T >= S / 3) {

두 번째 핵심 조건.

“필요한 +2의 최소 개수”와
“쓸 수 있는 +2의 최대 개수” 비교.

S = 3k 라면
3묶음을 k개 만들어야 함.

한 묶음(3)을 만들려면 반드시 +2가 최소 1개 필요

따라서 최소 +2는 k = S / 3

즉:

T(쓸 수 있는 +2 최대량)가
S/3(필요한 +2 최소량) 이상이면 가능

그래서 이 조건을 체크한다.

⑮ System.out.print("YES");

조건 만족 → 만들 수 있음 → YES

⑯ } else { System.out.print("NO"); }

T < S/3 → 필요한 +2를 만들 수 없음 → NO

⑰ scanner.close();

Scanner 자원 정리. 없어도 실행되지만 Java에서는 습관적으로 넣음.

🍎 전체 논리를 다시 한 번 정리하면

✔ S = 전체 목표 높이
✔ T = 전체 +2의 최대 가능 횟수

필요한 조건은 단 2개:

S % 3 == 0

총 증가량을 3 묶음으로 나눌 수 있어야 함

T >= S/3

S/3개의 3묶음(2+1)을 만들 수 있을 만큼 +2를 충분히 줄 수 있어야 함

이 두 조건을 충족하면
반드시 만들 수 있음 → YES

하나라도 실패하면
절대 불가능 → NO

