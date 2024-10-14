import java.lang.Math;
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            p.offer(nums[i]);
        }
        long score=0;
        while(k>0)
        {
            int val=p.poll();
            score+=val;
            p.offer((int) Math.ceil(val/3.0));
            k--;
        }
        return score;
    }
}