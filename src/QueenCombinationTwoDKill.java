import java.util.Scanner;

public class QueenCombinationTwoDKill {
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
        if(QueenCanBePlaced(a,row,col))
        {
            a[row][col] = true;
            combinations(a, tq, q + 1, ans + "{b" + row + "-" + col + "} ", row, col + 1);
            a[row][col] = false;
        }

        combinations(a, tq, q, ans, row, col + 1);
    }

    static boolean QueenCanBePlaced(boolean[][] a, int row, int col){
        int r = row-1;
        int c = col;
        while (r>=0)
        {
            if(a[r][c])
                return false;
            r--;
        }

        r = row;
        c = col-1;
        while (c>=0)
        {
            if(a[r][c])
                return false;
            c--;
        }

        r = row-1;
        c = col-1;
        while (r>=0&&c>=0)
        {
            if(a[r][c])
                return false;
            r--;
            c--;
        }

        r = row-1;
        c = col+1;
        while (r>=0&&c<a[0].length)
        {
            if(a[r][c])
                return false;
            c++;
            r--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int tq = sc.nextInt();
        combinations(new boolean[m][n], tq, 0, "", 0, 0);
    }
}
