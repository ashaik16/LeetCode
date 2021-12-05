class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
           if(flowerbed.length==1 && flowerbed[0]==0 )
           {
        if(n==0 ||n==1)
           return true;
          else 
     return false;
          }
     
            if(flowerbed.length==2 && flowerbed[0]==0 &&flowerbed[1]==0  )
            {
             if(n==1)
                return true;
            else
             return false;
            }
        
     for(int i=0;i<flowerbed.length;i++){
         if(count==n)
             break;
         if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0 )
         {
              
              flowerbed[i]=1;
             count++;
         }
         else if(i==flowerbed.length-1){
                
             if(flowerbed[i]==0 &&flowerbed[i-1]==0){
             flowerbed[i]=1;
             count++;
             }
         }
         else if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
               
              flowerbed[i]=1;
             count ++;
         }
     }
        if(count>=n)
            return true;
        else
            return false;
    }
}
