import java.util.Scanner;

public class QueenCombinationBoxRespect {
    static void combinations(boolean[] a, int tq, int q, String ans, int col)
    {
        if(tq==q)
        {
            System.out.println(ans);
            return;
        }
        if(col==a.length)
        return;
        a[col] = true;
        combinations(a, tq, q+1, ans+"b"+col+" ",col+1);
        a[col] = false;
        combinations(a, tq, q, ans,col+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tq = sc.nextInt();
        combinations(new boolean[n], tq, 0, "",0);
    }
}
