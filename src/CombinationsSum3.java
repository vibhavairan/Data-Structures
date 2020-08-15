import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationsSum3 {
    static List<List<Integer>> combinationSum(int k, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        combinations(n,k, new int[]{1,2,3,4,5,6,7,8,9},new ArrayList<>(), -1, lists);
        return lists;
    }
    static void combinations(int sum, int count, int[] a, List<Integer> ans, int lastCoinUsed, List<List<Integer>> lists)
    {
        if(count==0)
        {
            System.out.println(ans);
            if(sum==0)
            lists.add(new ArrayList<>(ans));
        }
        else
        {
            for(int x= lastCoinUsed+1;x<a.length;x++) {
                if (a[x] <= sum) {
                    ans.add(a[x]);
                    System.out.println(ans);
                    combinations(sum-a[x], count-1, a, ans, x, lists);
                    ans.remove(Integer.valueOf(a[x]));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(combinationSum(k,n));
    }
}
