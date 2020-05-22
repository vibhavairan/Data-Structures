import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.*;


public class HeightTree {
    public static class Graph{
        int height;
        int value;
        int parent;
        ArrayList<Graph> children;
    }
    public static void addchild(Graph par, Graph child)
    {
        par.children.add(child);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Graph> graph = new ArrayList<>();
        int root=-1;
        for(int x=0;x<n;x++)
        {
            Graph node = new Graph();
            node.parent = sc.nextInt();
            node.value = x;
            node.children = new ArrayList<Graph>();
            graph.add(node);
        }
        for(int childIndex=0;childIndex<graph.size();childIndex++)
        {
            if(graph.get(childIndex).parent == -1)
            {
                root = childIndex;
            }
            else
            {
                addchild(graph.get(graph.get(childIndex).parent), graph.get(childIndex));
            }
        }
        Graph graphRoot = graph.get(root);
        Deque<Graph> queue = new LinkedList<Graph>();
        queue.add(graphRoot);
        int max = 0;
        Graph p = new Graph();
        while(!queue.isEmpty())
        {
            p = queue.removeFirst();
            if(p.parent==-1)
            {
                p.height = 1;
            }
            else
            {
                p.height = graph.get(p.parent).height+1;
            }
            if(p.height>max)
                max = p.height;
            queue.addAll(graph.get(p.value).children);
        }
        System.out.println(max);
       /* for(int x=0;x<graph.size();x++)
        {
            System.out.println("VALUE: "+graph.get(x).value);
            System.out.println("HEIGHT: "+graph.get(x).height);
            System.out.print("CHILD: ");
            for(int y=0;y<graph.get(x).children.size();y++)
                System.out.print(graph.get(x).children.get(y).value+" ");
            System.out.println(" ");
        }*/
    }
}
