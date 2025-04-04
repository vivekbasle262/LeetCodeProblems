class Solution {
    public int maxOperations(int[] nums) {
       int count=0;
       int score=nums[0]+nums[1];
       for(int i=1;i<nums.length;i+=2)
       {
        if(nums[i]+nums[i-1]==score)
        {
            count++;
        }
        else{
            break;
        }
       }
       return count;
    }
}