import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // 도시 개수

        long[] dist = new long[N - 1];   // 도시간 거리
        long[] price = new long[N];      // 각 도시의 기름 가격

        // 거리 입력
        for (int i = 0; i < N - 1; i++) {
            dist[i] = sc.nextLong();
        }

        // 가격 입력
        for (int i = 0; i < N; i++) {
            price[i] = sc.nextLong();
        }

        long minPrice = price[0];  // 지금까지 본 주유소 중 최저 가격
        long totalCost = 0;        // 총 비용

        // 0번 도시부터 N-2번 도시까지(도로 구간 수만큼) 순회
        for (int i = 0; i < N - 1; i++) {
            // 지금까지 최저 가격으로 현재 구간 거리만큼 주유했다고 생각
            totalCost += minPrice * dist[i];

            // 다음 도시 가격이 더 싸면 최저 가격 갱신
            if (price[i + 1] < minPrice) {
                minPrice = price[i + 1];
            }
        }

        System.out.println(totalCost);
        sc.close();
    }
}
