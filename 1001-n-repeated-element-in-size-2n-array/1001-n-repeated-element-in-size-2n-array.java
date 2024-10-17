class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int freq:mp.keySet())
        {
            if(mp.get(freq)==n/2)
            {
                ans=freq;
                break;
            }
        }
        return ans;
    }
}