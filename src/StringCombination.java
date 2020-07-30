import java.util.Scanner;

public class StringCombination {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String num = n+"";
        String num1 = "";
        for(int x=0;x<num.length();x++)
        {
            int digit = Integer.parseInt(num.charAt(x)+"");
            if(digit==9&&x==0)
            {
                num1 = num1+digit+"";
            }
            else if(digit>(9-digit))
            {
                num1 = num1+(9-digit)+"";
            }
            else
                num1 = num1+digit+"";
        }
        System.out.println(num1);
    }
}
