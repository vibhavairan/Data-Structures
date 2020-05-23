import java.util.*;

public class NetworkPacketProcessing {
    public static class Packet{
        int arrival;
        int processing;
        int index;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int buffer = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Packet> packets = new ArrayList<>();
        int[] ans = new int[n];
        for(int x=0;x<n;x++)
        {
            Packet temp = new Packet();
            temp.arrival = sc.nextInt();
            temp.processing = sc.nextInt();
            temp.index = x;
            packets.add(temp);
        }
        Deque<Packet> queue = new LinkedList<>();
        int time=0;
        int x=0;
        while (queue.size()!=0||x<n)
        {
            while(x<n&&packets.get(x).arrival<=time)
            {
                if(queue.size()<buffer)
                {
                    if(packets.get(x).processing==0)
                        ans[packets.get(x).index] = time;
                    else
                    queue.add(packets.get(x));
                }
                else
                    ans[packets.get(x).index] = -1;
                x++;
            }
            if(queue.size()!=0&&queue.peekFirst().arrival<=time)
            {
                ans[queue.peekFirst().index] = time;
                time += queue.removeFirst().processing;
            }
            if(queue.size()==0&&x<n)
                time = packets.get(x).arrival;
        }
        for(int z=0;z<n;z++)
            System.out.println(ans[z]);
        //System.out.println("Size of queue "+queue.size());
    }
}