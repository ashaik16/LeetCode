/*Optimal*/
class Solution {
    public int lengthOfLastWord(String s) {
  s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                return count;
            else
                count++;
        }
        return count;
}
}
/*Aletrnative*/




public class CountOfLastWord {
	public static int lengthOfLastWord(String s) {
      
        char[] c=s.toCharArray();
        int count = 0;
        if(c.length==0)
        {
        	System.out.println("Empty string");
        count=1;
        return count;
        }
      
        else if(c.length==1)
        {
         
            count=1;
            return count;
        	
        }
       
        else  
        {
        	for(int i=0;i<c.length;i++)
        	{
        	if(c[i]==' ')
        	{
        		if(i==c.length)
        		{
        			return count;
        		}
        		else
        			if(i!=c.length-1 && c[i+1]!=' ')
        			count=0;
        	}
        	else
        	count++;
        	}
        }
		return count;
	}

	public static void main(String args[]) {
		int co = lengthOfLastWord("Hello World ");
		System.out.println(co);
	}
}
