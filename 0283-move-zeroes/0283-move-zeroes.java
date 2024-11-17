class Solution {
    public void moveZeroes(int[] nums) {
       int countzero=0;
       int k=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            countzero++;
        }
        else{
            nums[k]=nums[i];
            k++;
        }
       } 
       for(int i=0;i<countzero;i++)
       {
        nums[k]=0;
        k++;
       }
    }
}