import java.util.Scanner;

public class CountPalindrome {
    boolean a[][]= new boolean[1200][1200];
    static boolean possible(int x, int y, int x1, int y1){
        if(x==x1&&y==y1)
            return true;
        else if(x>x1||y>y1)
            return false;
        else
        {
            if(x+y>x1&&x+y>y1)
                return false;
            else if(x+y>x1&&x+y<y1)
                return possible(x,x+y,x1,y1);
            else if(x+y<x1&&x+y>y1)
                return possible(x+y,y,x1,y1);
            else
            return (possible(x+y,y,x1,y1)||possible(x,x+y,x1,y1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println(possible(x,y,x1,y1));
    }
}
