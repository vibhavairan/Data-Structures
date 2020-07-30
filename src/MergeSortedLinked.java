import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeSortedLinked {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        while (j!=0) {
            Deque<Integer> a = new LinkedList<>();
            Deque<Integer> b = new LinkedList<>();
            Deque<Integer> c = new LinkedList<>();
            int n1 = sc.nextInt();
            for (int x = 0; x < n1; x++) {
                a.add(sc.nextInt());
            }
            int n2 = sc.nextInt();
            for (int x = 0; x < n2; x++) {
                b.add(sc.nextInt());
            }
            int z1 = 0, z2 = 0;
            for (int x = 0; x < n1 + n2; x++) {
                if (a.peekFirst() < b.peekFirst()) {
                    c.add(a.removeFirst());
                    z1++;
                } else {
                    c.add(b.removeFirst());
                    z2++;
                }
                if (z1 == n1) {
                    c.addAll(b);
                    break;
                }
                if (z2 == n2) {
                    c.addAll(a);
                    break;
                }
            }
            for (Integer i : c) {
                System.out.print(i + " ");
            }
            j--;
        }
    }
}
