import org.w3c.dom.ls.LSOutput;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class NodeLand {
    static boolean check(String s)
    {
        String s1 = new StringBuilder().append(s).reverse().toString();
        return s1.equals(s);
    }
    //static int count = 0;
    static boolean calculate(String s)
    {
        System.out.println(s);
        if(s.length()<2)
            return false;
        else
        {
            if(check(s)) {
                return true;
            }
            if(s.length()%2==0)
            {
                return calculate(s.substring(0,s.length()/2)) || calculate(s.substring(s.length()/2));
            }
            else
            {
                int mid = s.length()/2;
                return calculate(s.substring(0,mid-1)) || calculate(s.substring(mid+1));
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int x=0;x<s.length;x++)
            s[x] = sc.next();
        int z=0;
        for(int x=0;x<n;x++)
        if(calculate(s[x]))
            z++;
        System.out.println(z);
    }
}
