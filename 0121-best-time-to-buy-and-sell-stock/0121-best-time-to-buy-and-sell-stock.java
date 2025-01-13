class Solution {
    public int maxProfit(int[] nums) {
      int minbuying=nums[0];
      int profit=0;
      for(int i=1;i<nums.length;i++)
      {
        minbuying=Math.min(minbuying,nums[i]);
        profit=Math.max(profit,nums[i]-minbuying);
      }
      return profit;
    }
}