import java.util.Scanner;

public class CoinChangeCombination {
    static void combinations(int[] a, int amount, String ans, int lastCoinUsed)
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            for(int x= lastCoinUsed;x<a.length;x++)
            {
                if(a[x]<=amount)
                {
                    combinations(a,amount-a[x], ans+a[x]+" ", x);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextInt();
        int amount = sc.nextInt();
        combinations(a, amount, "", 0);
    }
}
