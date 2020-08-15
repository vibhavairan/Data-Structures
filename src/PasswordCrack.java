import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCrack {
    static int count=0;
    static String calculate(List<String> list, int x, String s)
    {
        if(x==list.size()||s.length()==0)
            return "";
        else if(s.contains(list.get(x)))
        {
            count = count + list.get(x).length();
            String ans1 = list.get(x)+" ";
            return ans1+calculate(list,x,s.substring(0,s.indexOf(list.get(x))))+calculate(list,x,s.substring(s.indexOf(list.get(x))+list.get(x).length()));
        }
        else
            return calculate(list,x+1,s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int x = 0; x < n; x++)
            list.add(sc.next());
        String s = sc.next();
        String ans = calculate(list, 0, s);
        if (count == s.length())
            System.out.println(ans);
        else
            System.out.println("WRONG PASSWORD");
    }
}
