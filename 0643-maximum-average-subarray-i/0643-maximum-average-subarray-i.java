class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double max_avg=Integer.MIN_VALUE;
        if(nums.length<k)
        {
            return -1;
        }
        double sum=0.0;
        while(i<nums.length)
        {
            if(i<=k-1)
            {
                sum=sum+nums[i];
                if(i==k-1)
            {
                max_avg=Math.max(max_avg,sum/k);
               
            }
             
            }
            
            else{
                sum=sum+nums[i]-nums[j];
                 max_avg=Math.max(max_avg,sum/k);
                j++;    
            }
            i++;

        }
        return max_avg;
        
    }
}