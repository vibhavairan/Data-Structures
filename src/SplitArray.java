import java.util.Scanner;

public class SplitArray {
    static int count(int a[],int s,int n){
        if(s==0)
            return 1;
        else if(n==0)
            return 0;
        else if(s>=a[n-1])
        {
            return count(a,s-a[n-1],n-1)+count(a,s,n-1);
        }
        else
            return count(a,s,n-1);

    }
    static void print(int main[], int a[], int b[], int s, int n, int n1, int n2){
        if(s==0)
        {
            for(int x=0;x<n1;x++)
                System.out.print(a[x]+" ");
            System.out.print("and ");
            for(int x=0;x<n2;x++)
                System.out.print(b[x]+" ");
           System.out.println(n1+" "+n2);
           return;
        }
        if(n==0)
            return;
        else if(s>=main[n-1])
        {
            a[n1++] = main[n-1];
            print(main,a,b,s,n-1,n1,n2);
            b[n2++] = main[n-1];
            print(main,a,b,s-main[n-1],n-1,n1,n2);
        }
        else
        {
            a[n1++] = main[n-1];
            print(main,a,b,s,n-1,n1,n2);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int main[] = new int[n];
        for(int x=0;x<n;x++)
            main[x] = sc.nextInt();
        int sum=0;
        for(int x=0;x<n;x++)
            sum = sum + main[x];
      //  System.out.println(count(a,sum/2,n))
        int a[] = new int[n];
        int b[] = new int[n];
        print(main,a,b,sum/2,n,0,0);
    }
}
