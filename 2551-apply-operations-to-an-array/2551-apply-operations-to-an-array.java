class Solution {
    public int[] applyOperations(int[] nums) {
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]==nums[i+1])
        {
            nums[i]=nums[i]*2;
            nums[i+1]=0;

        }
       } 
       int countzero=0;
       int ans[]=new int[nums.length];
       int k=0;
       for(int i=0;i<nums.length;i++)
       {
            if(nums[i]!=0)
            {
                 ans[k]=nums[i];
                 k++;
            }
            else{
                countzero++;
            }
       }
       while(k<nums.length)
       {
        ans[k]=0;
        k++;
       }
       return ans;
    }
}