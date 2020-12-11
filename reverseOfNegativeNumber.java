import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reverseOfNegativeNumber {
	
	    public static int reverse(int x) {
	    	 int num=Math.abs(x);
	        int len=String.valueOf(num).length();
	        int rev=0;
	       
	        for(int i=0;i<len;i++)
	        {
	        rev=rev*10+num%10;
	       
	        
	        num=num/10;
	        }
	        if(x<0)
	            return -rev;
	        else
	        	return rev;
	        
	    }
	
 
    public static void main(String arr[])
    {
    	int num = -3021;
      	int ans;
    	ans=reverse(num);
    	System.out.println(ans);
    }
}