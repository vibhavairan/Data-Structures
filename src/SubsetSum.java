import java.util.Scanner;

public class SubsetSum {
    static boolean sum(int a[], int n, int w)
    {
        if(n==-1)
            return w == 0;
        else
            if(a[n]<=w)
            return (sum(a,n-1,w-a[n])||sum(a,n-1,w));
            else
                return sum(a,n-1,w);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(sum(a,n-1,w));
    }
}
