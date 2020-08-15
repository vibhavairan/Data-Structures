import java.util.Scanner;

public class LCSApproach {
   /* static int LCS (String s1, String s2, int n1, int n2)
    {
        if(n1==0||n2==0)
            return 0;
        if(s1.charAt(n1-1)==s2.charAt(n2-1))
         return Math.max(1+LCS(s1,s2,n1-1,n2),1+LCS(s1,s2,n1,n2-1));
        else
        {
            Math.max(LCS(s1,s2,n1-1,n2),LCS(s1,s2,n1,n2-1));
        }
    }
    public static void main(String[] args){
        String[] array = new String[]{"my","name"};
        String input = "ammanis";
        int z = 0;
        for(int x=0;x<array.length;x++)
        {
            if(LCS(array[x],input,array[x].length(),input.length())==array[x].length())
                z++;
        }
        System.out.println(z);
    }
*/
}
