class Solution {
    public int maxProfit(int[] nums) {
        int min=nums[0];
        int max=Integer.MIN_VALUE;
        if(nums.length==1)
        {
            return 0;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];

            }
            if(nums[i]-min>max)
            {
                max=nums[i]-min;
            }
        }
       return max; 
    }
}