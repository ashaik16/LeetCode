public class LongestCommonPrefix {
    public static char[]  longestCommonPrefix(String[] strs) {
		//String []s1=new String[strs.length];
        //int j=1;
        char []answer=new char[strs.length];
        int len=strs[0].length();
        for(int l=0;l<strs.length;l++)
        {
        	if(strs[l].length()<len)
        	{
        		len=strs[l].length();
        	}
        }
        for(int i=0; i<strs.length-1;i++)
        {
        	 char[]s1=strs[i].toCharArray();
        	
             char[]s2=strs[i+1].toCharArray();
         
        	for(int j=0;j<len;j++)
        	{
            
                if(s1[j]==s2[j])
                {
                 answer[j]=s2[j];
                }
                    else
                    {
                    	 i++;
                    break;
                    
                    }
                    }
                }
            
        
        
       System.out.println(answer);
	return answer; 
    }
    public static void main(String args[])
    {
    
    	String s[]= {"hello","heWorld","hesss","h"};
    	char [] s3=new char[s[0].length()];

    	
		s3=longestCommonPrefix(s);
    }
}