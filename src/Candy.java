import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Candy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNext())
            n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0;x<n;x++)
            if(sc.hasNext())
            a[x] = sc.nextInt();
        HashMap<Integer,Integer> sett = new HashMap<>();
        for(int x=0;x<n;x++)
        {
         if(sett.containsKey(a[x]))
         {
             int z = sett.get(a[x]);
             sett.replace(a[x],z+1);
         }
         else
             sett.put(a[x],1);
        }
        for(Map.Entry<Integer, Integer> s :sett.entrySet()) {
            if (s.getValue() % 2 != 0) {
                System.out.println(s.getKey());
                break;
            }
        }

    }
}
