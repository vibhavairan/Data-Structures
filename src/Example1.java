import java.util.*;

public class Example1 {
    public static void main(String[] args){
        String s = "{(}";
        boolean flag = true;
        Deque<Character> stack = new LinkedList<>();
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='{')
                stack.push(s.charAt(x));
            else
                if(s.charAt(x)=='(')
                    stack.push(s.charAt(x));
                else
                if(s.charAt(x)=='}')
                    if(stack.peekFirst()=='{')
                        stack.pop();
                    else
                    {
                        flag = false;
                        break;
                    }
                    else
                if(s.charAt(x)==')')
                    if(stack.peekFirst()=='(')
                        stack.pop();
                    else
                        {
                            flag = false;
                            break;
                        }

        }
        System.out.println(flag);
    }
}
