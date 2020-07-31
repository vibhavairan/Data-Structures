import java.util.Scanner;

public class QueenCombinationTwoD {
    static void combinations(boolean[][] a, int tq, int q, String ans, int row, int col) {
        if (tq == q) {
            System.out.println(ans);
            return;
        }
        if (col == a[0].length) {
            combinations(a, tq, q, ans, row + 1, 0);
            return;
        }
        if (row == a.length)
            return;
        a[row][col] = true;
        combinations(a, tq, q + 1, ans + "{b" + row + "-" + col + "} ", row, col + 1);
        a[row][col] = false;
        combinations(a, tq, q, ans, row, col + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int tq = sc.nextInt();
        combinations(new boolean[m][n], tq, 0, "", 0, 0);
    }
}
