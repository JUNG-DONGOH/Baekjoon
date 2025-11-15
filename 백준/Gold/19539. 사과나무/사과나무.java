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
