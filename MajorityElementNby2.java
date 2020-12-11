public class MajorityElementNby2 {
    public static int majorityElement(int[] nums) {
      int count=0;
        int majorityElement=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==majorityElement)
                count++;
            else
                count--;
            if(count==0)
            {
              majorityElement=nums[i];
            count=1;
            }
        }
        return majorityElement;
    }
    public static void main(String arr[])
    {
    	int[] majority= {3,2,3};
    	int major=majorityElement(majority);
    	System.out.println(major);
    }
}
//o(1)space complexity abd time complexity o(n)