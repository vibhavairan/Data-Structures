import java.util.Scanner;

public class CyclicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextInt();
        int op = sc.nextInt();
        int b[] = new int[op];
        for(int x=0;x<op;x++)
            b[x] = sc.nextInt();
        int idx=0;
        int sum=0;
        for(int x=0;x<op;x++)
        {
            for(int y=0;y<n;y++)
            {
                idx = y-b[x];
                if(idx<0)
                    idx = y-b[x] + n;
                a[y] = a[y] + a[idx];
                if(y==n-1)
                sum = sum + a[y];
            }
        }
        System.out.println(sum);
    }
}
