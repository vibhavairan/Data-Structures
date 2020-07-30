import java.util.Scanner;

public class GreatestEvenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;
        boolean z = false;
        double x=0;
        long mid=0;
        long last = temp%10;
        temp = temp/10;
        while (temp!=0){
            if((temp%10)%2==0)
            {
               z=true;
               break;
            }
            else
            {
                mid = mid+(long) Math.pow(10,x)*(temp%10);
                x++;
            }
            temp=temp/10;
        }
        System.out.println(mid);
        System.out.println(temp);
        System.out.println(x);
        System.out.println(last);
        if(z)
        {
            long first = temp%10;
            temp = temp/10;
            temp = (long) (temp*Math.pow(10,x+2))+(long) (last*Math.pow(10,x+1))+mid*10+first;
            System.out.println(temp);
        }
        else
            System.out.println(-1);
    }
}
