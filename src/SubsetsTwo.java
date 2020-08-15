import java.lang.reflect.Array;
import java.util.*;

public class SubsetsTwo {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return lists;
        Arrays.sort(nums);
        combinations(nums, lists, new ArrayList<>(), 0);
        Set<List<Integer>> set = new LinkedHashSet<>(lists);
        lists.clear();
        lists.addAll(set);
        return lists;
    }

    static void combinations(int[] nums, List<List<Integer>> lists, List<Integer> ans, int index) {
        lists.add(new ArrayList<>(ans));
        for (int x = index; x < nums.length; x++) {
            ans.add(nums[x]);
            combinations(nums, lists, ans, x + 1);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int x = 0; x < n; x++)
            a[x] = sc.nextInt();
        System.out.println(subsets(a));
    }
}
