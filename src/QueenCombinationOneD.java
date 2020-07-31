import java.util.Scanner;

public class QueenCombinationOneD {
    static void combinations(boolean[] a, int tq, int q, String ans, int lastBoxUsed)
    {
        if(tq==q)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            for(int x= lastBoxUsed+ 1;x<a.length;x++)
            {
                    a[x] = true;
                    combinations(a, tq, q+1, ans+"q"+q+" "+"b"+x+"  ", x);
                    a[x] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tq = sc.nextInt();
        combinations(new boolean[n], tq, 0, "", -1);
    }
}
