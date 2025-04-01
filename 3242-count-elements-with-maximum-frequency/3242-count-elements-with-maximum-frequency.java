class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.get(nums[i]));


        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==max)
            {
                ans+=max;
            }
        }
return ans;

    }
}