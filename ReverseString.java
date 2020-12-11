public class ReverseString {
    public static void reverseString(char[] c1) {
 int j=c1.length-1;   	

for(int i=0;i<c1.length/2;i++)
{
	char temp=c1[i];
	c1[i]=c1[j];;
	c1[j]=temp;
	//System.out.println(c2[i]);
	j--;
}
System.out.println(c1);
}
	
	public static void main(String args[])
	{
        String s="Hello World";
        char[] c1=s.toCharArray();
		
        reverseString(c1);
	}  
    }
