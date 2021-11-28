
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

