import java.util.*;

public class ExtendingStack {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> input = new ArrayList<String>();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackMax = new Stack<Integer>();
        for(int x=0;x<n+1;x++)
        {
            input.add(sc.nextLine());
        }
        for(int x=1;x<n+1;x++)
        {
            String s = input.get(x);
            if(s.equals("max")) {
                System.out.println(stackMax.peek());
            }
            else
                if(s.equals("pop"))
                {
                    stack.pop();
                    stackMax.pop();
                }
                else
                {
                    int num = Integer.parseInt(s.substring(5));
                    if(stack.isEmpty())
                        stackMax.push(num);
                    else if(stackMax.peek()>num)
                        stackMax.push(stackMax.peek());
                    else
                        stackMax.push(num);
                    stack.push(num);
                }
        }
    }
}
