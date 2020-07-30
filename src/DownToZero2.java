public class DownToZero2 {
    static int printDivisors(int n)
    {
        int ans=0;
        for (int i=2; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n=3, count=0;
       while (n!=0)
        {
            int temp = n;
            n = printDivisors(n);
            if(n == 0)
            {
                n = temp-1;
                count++;
            }
            else
                count++;
        }
        System.out.println(count);
    }
}
