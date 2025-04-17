class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxdiff=0;
        for(int i=0;i<nums.length-1;i++)
        {
            maxdiff=Math.max(maxdiff,Math.abs(nums[i]-nums[i+1]));
        }
        maxdiff=Math.max(maxdiff,Math.abs(nums[nums.length-1]-nums[0]));
        return maxdiff;
    }
}