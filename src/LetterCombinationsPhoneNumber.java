import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationsPhoneNumber {
    static List<String> combinationSum(String s, int n) {
        List<String> lists = new ArrayList<>();
        String[] data = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //combinations(n,k, new int[]{1,2,3,4,5,6,7,8,9},new ArrayList<>(), -1, lists,data);
        return lists;
    }
  /* static void combinations(String s,int num, int n, int[] a, String ans, List<String> lists, String[] data)
    {
        if(n==0)
        {
            lists.add(ans);
        }
        else
        {
            for(int x= 0;x<s.length();x++) {
                ans = ans+(data[s.charAt(x)-2].charAt(num));
                combinations(s,num );
                ans = ans.substring(0,ans.length()-1);
                }
            }
        }
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(combinationSum(s,n));
    }
}
