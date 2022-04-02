/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.*/


/*Optimal*/


class Solution {
    
    public int addDigits(int num) {
        
if(num<10)
    return num;
        else
          return addDigits((num%10)+(num/10));
    }
}




public class AddTwoDigitTillDigitisOne {
    public static int addDigits(int num) {
    	
        int rev_num=0;
        
       while(num>9)
       {
         int secondNumber=rev_num *10 + num%10;
           int firstNumber=num/10;
             num=firstNumber+secondNumber;
       }
        return num;
    }
    public static void main(String arr[])
    {
    	int num=38;
    	int ans=addDigits(num);
    	System.out.println(ans);
    }
}

/*Alternative*/

class Solution {
    
    public int addDigits(int num) {
        
return calculateSum(num);
         
        
    }   
     int calculateSum(int num){
               int temp=0,sum=0;
            String numString=String.valueOf(num);
             char c1[]=numString.toCharArray();
         for(char c:c1){
            temp=Integer.parseInt(String.valueOf(c));
            sum=sum+temp;
           
        }
          return sum>9?calculateSum(sum):sum;
 

    }
}
