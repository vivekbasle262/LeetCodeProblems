class Solution {
    public int smallestRangeI(int[] nums, int k) {
     int min=nums[0];
     int max=nums[0];
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]<min)
        {
            min=nums[i];

        }
        else if(nums[i]>max)
        {
            max=nums[i];
        }
     }
     return (max-k)-(min+k)<0?0:(max-k)-(min+k);
        
    }
}