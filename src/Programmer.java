import java.util.Scanner;

public class Programmer {
     static int programmerStrings(String s1) {
        char s[] = s1.toCharArray();
         int length = s.length;
         for(int i=0;i<length;i++)
         {
             if(!(s[i]=='p' || s[i]=='r' || s[i]=='o' || s[i]=='g' || s[i]=='a' || s[i]=='m' || s[i]=='e'))
                 s[i] = 'x';
         }
         int z = 0;
         int[] pehla = new int[] {1,3,1,1,1,2,1};
         int tot=10;
         int[] dusra = new int[]{1,3,1,1,1,2,1};
         int pehlaEnd = 0,dusraEnd=0;
         for(int i=0;i<length && tot>0;i++)
         {
             if(s[i] == 'p' && pehla[0]>0)
             {
                 pehla[0]--;
                 tot--;
             }
             else if(s[i] == 'r' && pehla[1]>0)
             {
                 pehla[1]--;
                 tot--;
             }
             else if(s[i] == 'o' && pehla[2]>0)
             {
                 pehla[2]--;
                 tot--;
             }
             else if(s[i] == 'g' && pehla[3]>0)
             {
                 pehla[3]--;
                 tot--;
             }
             else if(s[i] == 'a' && pehla[4]>0)
             {
                 pehla[4]--;
                 tot--;
             }
             else if(s[i] == 'm' && pehla[5]>0)
             {
                 pehla[5]--;
                 tot--;
             }
             else if(s[i] == 'e' && pehla[6]>0)
             {
                 pehla[6]--;
                 tot--;
             }
             pehlaEnd = i;
         }
         tot = 10;
         for(int i=length-1;i>=0 && tot>0;i--)
         {
             if(s[i] == 'p' && dusra[0]>0)
             {
                 dusra[0]--;
                 tot--;
             }
             else if(s[i] == 'r' && dusra[1]>0)
             {
                 dusra[1]--;
                 tot--;
             }
             else if(s[i] == 'o' && dusra[2]>0)
             {
                 dusra[2]--;
                 tot--;
             }
             else if(s[i] == 'g' && dusra[3]>0)
             {
                 dusra[3]--;
                 tot--;
             }
             else if(s[i] == 'a' && dusra[4]>0)
             {
                 dusra[4]--;
                 tot--;
             }
             else if(s[i] == 'm' && dusra[5]>0)
             {
                 dusra[5]--;
                 tot--;
             }
             else if(s[i] == 'e' && dusra[6]>0)
             {
                 dusra[6]--;
                 tot--;
             }
             dusraEnd = i;
         }
         z = dusraEnd-pehlaEnd-1;
         return z;
     }
    public static void main(String[] args){
        System.out.println(programmerStrings("programmerxxxprozmerqgram"));
    }
}
