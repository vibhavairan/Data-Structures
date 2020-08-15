import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Example {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{10,5,34,67,89,546,23,1,2131,321};
        int count=0, temp=0;
        for(int x=0;x<a.length;x++)
        {
            int b = x;
            for(int y=x+1;y<a.length;y++)
            {
                if(a[b]<a[y])
                {
                    b = y;
                }
            }
            temp = a[b];
            a[b] = a[x];
            a[x] = temp;
        }
        for(int x:a)
            System.out.println(x);
    }
}
