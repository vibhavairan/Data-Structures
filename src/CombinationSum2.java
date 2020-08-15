import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum2 {
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        combinations(candidates, target, new ArrayList<>(), -1, lists);
        Set<List<Integer>> set = new LinkedHashSet<>(lists);
        lists.clear();
        lists.addAll(set);
        return lists;
    }
    static void combinations(int[] a, int amount, List<Integer> ans, int lastCoinUsed, List<List<Integer>> lists)
    {
        if(amount==0)
        {
            Collections.sort(ans);
            lists.add(new ArrayList<>(ans));
        }
        else
        {
            for(int x= lastCoinUsed+1;x<a.length;x++)
            {
                if(a[x]<=amount)
                {
                    ans.add(a[x]);
                    combinations(a,amount-a[x], ans, x, lists);
                    ans.remove(Integer.valueOf(a[x]));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextInt();
        int amount = sc.nextInt();
        System.out.println(combinationSum(a,amount));
    }
}
