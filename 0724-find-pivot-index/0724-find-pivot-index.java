class Solution {
    public int pivotIndex(int[] nums) {
       
    int n=nums.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            leftsum[i]=nums[i]+sum;
            sum=leftsum[i];
        }
        sum=0;
          for(int i=n-1;i>=0;i--)
        {
            rightsum[i]=nums[i]+sum;
            sum=rightsum[i];
        }
    int low=0;
    int high=0;

        while(low<n && high<n)
        {
            if(leftsum[low]==rightsum[high])
            {
                return low;
            }
            low++;
            high++;
        }
        return -1;
        


    }   
}