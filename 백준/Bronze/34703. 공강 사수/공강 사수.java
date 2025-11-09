import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 강의 수
        boolean[] seen = new boolean[5];  // 월(0)~금(4)
        
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();  // 예: 1=월,2=화,…5=금
            if (day >= 1 && day <= 5) {
                seen[day - 1] = true;
            }
        }
        
        int count = 0;
        for (boolean b : seen) {
            if (b) count++;
        }
        
        if (count < 5) {
            System.out.println("YES");  // 공강 존재 → 성공
        } else {
            System.out.println("NO");   // 모든 요일에 수업 있음 → 실패
        }
    }
}
