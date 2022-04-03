
/*Optimal*/
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
    List<Character> openBracketList= new ArrayList<>();
     openBracketList.add('(');
     openBracketList.add('{');
     openBracketList.add('[');
    List<Character> closeBracketList= new ArrayList<>();
     closeBracketList.add(')');
     closeBracketList.add('}');
     closeBracketList.add(']');
      Stack<Character> stack = new Stack<>(); 

        for(int i=0;i<s.length();i++){
            if(openBracketList.contains(s.charAt(i)))
                stack.add(s.charAt(i));
            else
            {
                if(!stack.isEmpty())
                {
               char temp=closeBracketList.get(openBracketList.indexOf(stack.peek()));  
                if(temp==s.charAt(i))
                    stack.pop();
                else
                    return false;
            }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
/*Alternative*/








/*https://leetcode.com/problems/valid-parentheses/*/
class Solution {
    public boolean isValid(String s) {
		char c1[] = { '(', '{', '[' };
		char c2[] = { ')', '}', ']' };
		int newFound = 0;
		Stack<Character> stack = new Stack<>();

		System.out.println("Length" + s.length());
    if(s.length()==1)
        return false;
		for (int i = 0; i < s.length() ; i++) {
			int found = new String(c1).indexOf(s.charAt(i));
			if(found==-1)
			{
				 newFound = new String(c2).indexOf(s.charAt(i));
			if(!stack.isEmpty() && c1[newFound]!=stack.peek())
			return false;
			else if(stack.isEmpty())
				return false;
						
			else
				stack.pop();
			}
			else
				stack.push(s.charAt(i));

	}
        	if(!stack.isEmpty())
			return false;
		return true;
	}
     
    }

