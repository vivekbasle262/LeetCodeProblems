class Solution {
    public long maximumTripletValue(int[] nums) {
        int max=Integer.MIN_VALUE;
        int differ=0;
        long ans=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            if(i>=2)
            {
                ans=Math.max(ans,(long)differ*nums[i]);
            }
            if(i>=1)
            {
                differ=Math.max(differ,max-nums[i]);
            }
        }
        
        return ans;
    }
}