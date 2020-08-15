import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item{
    int A;
    int B;
}
public class CoinCollection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Q = sc.nextInt();
        int[][] a = new int[Q][2];
        for(int x=0;x<Q;x++)
        {
            a[x][0] = sc.nextInt();
            a[x][1] = sc.nextInt();
        }
        int preVal = 0;
        int value = 0;
        for(int x=0;x<Q;x++)
        {
            if(a[x][0]==0) // ADD
            {
                if(value>=X)
                {
                    preVal = value;
                    value += a[x][1];
                }
                else {
                    preVal = value;
                    value += (a[x][1]) * 2;
                }
            }
            else //SELL
            {
                if(value>Y)
                    value = preVal;
            }
        }
        System.out.println(value);
    }
}
