class Solution {
    public int maxProfit(int[] nums) {
       int profit=0;
       int sum=nums[0];
       for(int i=1;i<nums.length;i++)
       {

          sum=Math.min(sum,nums[i]);
          profit=Math.max(nums[i]-sum,profit);
       }
       return profit;
    }
}