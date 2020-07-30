import java.util.Scanner;

public class CoinChangeProblem {
    static long sum(int a[], int n, int W)
    {
        int i,w;
        long K[][] = new long[n + 1][W + 1];

        for(i = 0; i<= n; i++){
            for (w = 0; w<= W; w++) {
                if (i == 0&&w==0)
                    K[i][w] = 1;
                else if(i==0)
                    K[i][w] = 0;
                else if(w==0)
                    K[i][w] = 1;
                else if (a[i - 1]<= w)
                    K[i][w] = ( K[i][w - a[i - 1]] + K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println(sum(a,n,w));
    /*   System.out.println("   ");
        for (int row=0; row < n+1; row++)
        { for (int col=0; col < w+1; col++)
         System.out.print(dp[row][col]+" ");
            System.out.println(" ");
        }*/
    }
}
