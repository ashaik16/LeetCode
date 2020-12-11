public class LastOneBitCharacter {
public static boolean isOneBitCharacter(int[] bits) {
  int i=0;
   while(i<bits.length-1)
   {
       if(bits[i]==0 && i<bits.length-1)
       
           i++;
       
       else
    	   if(i<bits.length-1)
           i=i+2;
           
   }
       if(i==bits.length-1)
      
        return true; 
       
    else
         return false;  
       
          
    }
public static void main(String arr[])
{
int bits[]= {1,1,1,0};
boolean isOneBit=isOneBitCharacter(bits);
System.out.println(isOneBit);
}
}
