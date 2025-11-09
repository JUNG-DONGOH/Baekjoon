import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] area = new boolean[100][100];
        int paperNum = scanner.nextInt();

        for (int i = 0; i < paperNum; i++) {
            int xStart = scanner.nextInt();
            int yStart = scanner.nextInt();

            for (int x = xStart; x < xStart + 10; x++) {
                for (int y = yStart; y < yStart + 10; y++) {
                    area[x][y] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (area[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}
