import java.util.Scanner;

public class QueenPermutationOneD {
    static void permutation(boolean[] a, int tq, int q, String ans)
    {
        if(tq==q)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            for(int x=0;x<a.length;x++)
            {
                if(!a[x])
                {
                    a[x] = true;
                    permutation(a, tq, q+1, ans+"q"+q+" "+"b"+x+"  ");
                    a[x] = false;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tq = sc.nextInt();
        permutation(new boolean[n], tq, 0, "");
    }
}
