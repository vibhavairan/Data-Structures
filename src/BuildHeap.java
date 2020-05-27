import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuildHeap {
    public static class Swap
    {
        int left;
        int right;
        public Swap(){

        }
        public Swap(int i, int minIndex) {
            this.left = i;
            this.right = minIndex;
        }
    }
    static int parent(int i)
    {
        return (i-1)/2;
    }
    static int leftChild(int i)
    {
        return 2*i+1;
    }
    static int rightChild(int i)
    {
        return 2*i+2;
    }
    static int Siftdown(int i, int[] arr, int size, ArrayList<Swap> list, int count)
    {
        int minIndex = i;
        int l = leftChild(i);
        if(l<size && arr[l]<arr[minIndex])
            minIndex = l;
        int r = rightChild(i);
        if(r<size && arr[r]<arr[minIndex])
            minIndex = r;
        if(i!=minIndex)
        {

            list.add(new Swap(i,minIndex));
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            count = Siftdown(minIndex, arr, size, list, count);
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int[] arr = new int[n];
        ArrayList<Swap> list = new ArrayList<>();
        for(int x=0;x<n;x++)
            arr[x] = sc.nextInt();
        for(int x = n/2; x>=0;x--)
        {
           count = Siftdown(x,arr,n,list,count);
        }
        //for(int x=0;x<n;x++)
        //System.out.print(arr[x]+" ");
        System.out.println(count);
        for(Swap obj : list)
            System.out.println(obj.left+" "+obj.right);
    }
}
