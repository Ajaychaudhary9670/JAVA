import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int M = sc.nextInt();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int total = 0;

            for (int j = 0; j < M; j++) {

                int marks = sc.nextInt();

                total += marks;

                if (marks > max) {
                    max = marks;
                }

                if (marks < min) {
                    min = marks;
                }
            }

            double average = Math.floor((double) total * 10 / M) / 10;

            System.out.printf("%d %d %d %.1f%n", max, min, total, average);
        }

        sc.close();
    }
}
