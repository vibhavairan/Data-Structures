import java.util.Scanner;

public class CoinChangePermutation {
    static void permutations(int[] a, int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        } else {
            for (int x = 0; x < a.length; x++) {
                if (a[x] <= amount) {
                    permutations(a, amount - a[x], ans + a[x] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int x = 0; x < n; x++)
            a[x] = sc.nextInt();
        int amount = sc.nextInt();
        permutations(a,amount,"");
    }
}
