import java.util.Arrays;
import java.util.Scanner;

public class DigitsNext {
    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static String findNext(String s, int n)
    {
        char ar[] = s.toCharArray();
        int i;
        String ans = "";
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
        if (i == 0)
        {
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, n);
            for (i = 0; i < n; i++)
                ans = ans+ar[i]+"";
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(findNext(s,n));
    }
}
