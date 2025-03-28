class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int max=Integer.MIN_VALUE;
       int zeros=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;

            }
            while(zeros>1)
            {
                if(nums[left]==0)
                {
                    zeros--;
                }
                left++;
            }
            max=Math.max(max,i-left);
        }
        return max;
        
    }
}