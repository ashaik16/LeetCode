class Solution {
            int result=0;
    boolean found=false;
    public int searchInsert(int[] nums, int target) {
    	int mid = 0 + (nums.length - 0) / 2;
      
       if(nums[mid]==target)
            return mid;
        else if(nums[nums.length-1]<target)
            return nums.length;
        else if(nums[mid]>target){
            calculate(0,mid,target,nums);
            if(found==false)
               result=nearestIndex(0,mid,target,nums); 
        }
          
            else{
                  calculate(mid+1,nums.length,target,nums); 
                    if(found==false)
               result= nearestIndex(mid+1,nums.length,target,nums); 
            }
           
        return result;  
            }
       public int calculate(int first,int last,int target, int nums[]){
            for(int i=first;i<last;i++){
                if(nums[i]==target){
                           result=i;
                    found=true;
                }
                
                  
            }
 return result;  
        }
   public int nearestIndex(int first,int last,int target, int nums[]){
           for(int i=first;i<=last;i++){
                if(nums[i]>target){
                         result=i;
                    break;
                }
          
                  
            }
              
       
 return result;
    }
    }
