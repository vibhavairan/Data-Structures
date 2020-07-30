import java.util.Scanner;
public class TargetSum {
    static int sum(int a[], int n, int w, int x)
    {
        if(n==-1)
            if(w == x)
                return 1;
            else
                return 0;
        else
            return (sum(a,n-1,w-a[n],x)+ sum(a,n-1,w+a[n],x));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int x = sc.nextInt();
        int w=0;
        System.out.println(sum(a,n-1,w,x));
    }
}
