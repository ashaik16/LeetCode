import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBuzz {
    public static List<String> fizzBuzz(int n) {
    	List<String> s1 = Arrays.asList(new String[n]);
    String str="";

        for(int i=1;i<=n;i++)
        {
          if(i%3==0 && i%5==0)
          {
              s1.set(i-1, "FizzBuzz");
        
          }
            
           else if(i%3==0)
          {
        	   s1.set(i-1, "Fizz");
        	
          }
            
          else if(i%5==0)
          {
        	  s1.set(i-1, "Buzz");
        
          }
            else
            {
            	 str=String.valueOf(i);
                s1.set(i-1, str); 
            }
        }
        
		return s1;
    }
    public static void main(String arr[])
    {
    	int n=15;
    	List<String>s2=new ArrayList<String>(n);
    	s2=fizzBuzz(n);
    for (String s:s2)
System.out.println(s);
    }
}