import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumSliding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int x=0;x<n;x++)
        arr[x] = sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> deque = new LinkedList<Integer>();
        int i;
        for (i = 0; i < m; ++i) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }

        for (; i < n; ++i) {
            System.out.print(arr[deque.peek()] + " ");
            while ((!deque.isEmpty()) && deque.peek() <= i - m)
                deque.removeFirst();
            while ((!deque.isEmpty()) && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()]);
    }
}
