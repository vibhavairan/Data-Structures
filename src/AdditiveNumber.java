import java.util.Scanner;

public class AdditiveNumber {
    static boolean calculate(String s){
        int n = s.length();
        if(n<3)
            return true;
        else
        {
            if(Integer.parseInt(s.charAt(n-1)+"")!=Integer.parseInt(s.charAt(n-2)+"")+Integer.parseInt(s.charAt(n-3)+""))
                return false;
            else
                return calculate(s.substring(0,s.length()-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calculate(s));
    }
}
