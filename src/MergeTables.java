import java.util.ArrayList;
import java.util.Scanner;

public class MergeTables {
    static class UnComp{
        int first;
        int second;
    }
    static void makeSet(int i, int[] parent, int[] rank, int[] size, int[] arr){
        parent[i] = i;
        rank[i] = 0;
        size[i] = arr[i];
    }
    static int find(int i, int[] parent){
        while (i!=parent[i])
            i = parent[i];
        return i;
    }
    static int Union(int i, int j, int[] parent, int[] rank, int[] size, int max){
        int i_id = find(i, parent);
        int j_id = find(j, parent);
        if(i_id==j_id)
            return max;
      if(rank[i_id]>rank[j_id])
          parent[j_id] = i_id;
      else {
          parent[i_id] = j_id;
          if(rank[j_id]==rank[i_id])
              rank[j_id]++;
      }
      int temp = size[i_id];
      size[i_id] += size[j_id];
      size[j_id] += temp;
        return Math.max(max, size[i_id]);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] size = new int[n];
        int[] parent = new int[n];
        int[] rank = new int[n];
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        ArrayList<UnComp> list = new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            arr[x] = sc.nextInt();
            makeSet(x,parent,rank,size,arr);
            if(max<arr[x])
                max = arr[x];
        }
        for(int x=0;x<m;x++)
        {
            UnComp temp = new UnComp();
            temp.first = sc.nextInt();
            temp.second = sc.nextInt();
            list.add(temp);
        }
        for(UnComp obj : list)
        {
            max = Union(obj.first-1, obj.second-1, parent, rank, size, max);
            System.out.println(max);
        }
    }
}
