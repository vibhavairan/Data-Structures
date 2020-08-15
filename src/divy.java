import java.util.Scanner;

public class divy {
    static String s = "";
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    static void bin(int n)
    {
        if (n > 1)
            bin(n/2);
        s=s+n%2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
        bin(n);
        System.out.println(s.length()-s.indexOf('1')-1);
        System.out.println(s.length()-s.lastIndexOf('1')-1);
        System.out.println();
    }
}
