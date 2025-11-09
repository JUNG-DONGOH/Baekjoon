import java.util.Scanner;

public class Lv2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] area = new boolean[100][100]; //2차원 배열로 구성
        int paperNum = scanner.nextInt();

        for (int i = 0; i < paperNum; i++) { // paperNum만큼 반복
            int xStart = scanner.nextInt();
            int yStart = scanner.nextInt();

            for (int x = xStart; x < xStart + 10; x++) {
                for (int y = yStart; y < yStart + 10; y++) {
                    area[x][y] = true; // area[x][y]부분에 false->true로 바꿈
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (area[i][j]) count++; // area[x][y]부분이 true면 count 증가
            }
        }

        System.out.println(count);
    }
}
