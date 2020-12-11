import java.util.Stack;

public class ReverseWithStack {
    public static void reverseString(Stack stack) {
char [] reverse = new char[stack.size()] ;
int size=stack.size();
for(int i=0;i<size;i++)
{
   reverse[i]=(char) stack.pop();
    System.out.println(reverse[i]);
}

}
	
	public static void main(String args[])
	{
        String s="Hello";
        char[] c1=s.toCharArray();
		Stack <Character>stack=new Stack<Character>();
        for(int i=0;i<c1.length;i++)
        {
		stack.push(c1[i]);
            }
        reverseString(stack);
	}  
    }
