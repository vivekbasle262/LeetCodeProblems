class Solution {
    public int removeElement(int[] nums, int val) {
         int n=nums.length;
        int i=0;
        int count=0;
        int k=0;
        while(i<n)
        {
            if(nums[i]==val)
            {
                i++;
                continue;
            }
            else
            {
                nums[k]=nums[i];
                k++;
                count++;
            }
            i++;


        }
        return count;
    }
}