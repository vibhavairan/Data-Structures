import java.util.*;

public class Combinations {
    static List<List<Integer>> combinationSum(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        combinations(n, k, new ArrayList<>(), -1, lists);
        return lists;
    }
    static void combinations(int n, int k, List<Integer> ans, int lastCoinUsed, List<List<Integer>> lists)
    {
        if(k==0)
        {
            lists.add(new ArrayList<>(ans));
        }
        else
        {
            for(int x= lastCoinUsed+1;x<n;x++)
            {
                ans.add(x+1);
                combinations(n,k-1, ans, x, lists);
                ans.remove(Integer.valueOf(x+1));
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(combinationSum(n,k));
    }
}
