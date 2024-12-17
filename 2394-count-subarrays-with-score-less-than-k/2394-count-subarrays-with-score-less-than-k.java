class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans=0;
        int i=0,j=0;
        long sum=0;
        while(j<nums.length)
        {
            sum=sum+nums[j];
            while(sum*(j-i+1)>=k)
            {
                sum=sum-nums[i];
                i++;
            }
            ans=ans+j-i+1;
            j++;
        }
        return ans;
    }
}