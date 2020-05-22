import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = true;
        int pos = -1, newpos =-1;
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int x=0;x<s.length();x++)
        {
            try {
                if(s.charAt(x)=='{'||s.charAt(x)=='['||s.charAt(x)=='(')
                {
                    stack.push(s.charAt(x));
                    stack2.push(x);
                }
                else if(s.charAt(x)=='}')
                {
                    if(stack.peek()=='{')
                    {
                        stack.pop();
                        stack2.pop();
                    }
                    else
                    {
                        flag = false;
                        pos = x+1;
                        break;
                    }
                }
                else if(s.charAt(x)==']')
                {
                    if(stack.peek()=='[')
                    {
                        stack.pop();
                        stack2.pop();
                    }
                    else
                    {
                        flag = false;
                        pos = x+1;
                        break;
                    }
                }
                else if(s.charAt(x)==')')
                {
                    if(stack.peek()=='(')
                    {
                        stack.pop();
                        stack2.pop();
                    }
                    else
                    {
                        flag = false;
                        pos = x+1;
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                pos = x+1;
                flag = false;
                break;
            }
        }
        if(flag&&stack.isEmpty())
            System.out.println("Success");
        else
            if(flag)
            System.out.println(stack2.peek()+1);
            else
                System.out.println(pos);
    }
}
