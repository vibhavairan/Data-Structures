import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Result {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a[] = new char[n];
        for(int x=0;x<n;x++)
            sc.next().charAt(0);
        int z=0;
        for(int x=0;x<n;x++)
        {a[x] = Character.toLowerCase(a[x]);
            if(a[x]!='a'||a[x]!='e'||a[x]!='i'||a[x]!='o'||a[x]!='u')
                z++;}
        System.out.println(z);
    }
}

