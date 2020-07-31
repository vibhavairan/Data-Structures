import java.util.Scanner;

public class CoinChangeCombinationBoxRespect {
    static void combinations(int a[], int amount, int idx, String ans){
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        if(idx==a.length||amount<0)
            return;
        combinations(a,amount-a[idx],idx,ans+a[idx]);
        combinations(a,amount,idx+1,ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextInt();
        int amount = sc.nextInt();
        combinations(a,amount,0,"");
    }
}
