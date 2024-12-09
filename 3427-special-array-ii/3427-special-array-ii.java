class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
       
        boolean ans[] = new boolean[queries.length];

        int[] cnt = new int[nums.length];
        int c = 0;
        cnt[0]= 0;
        for(int i =1;i<nums.length;i++){
            if((nums[i]%2==0 &&nums[i-1]%2==0)||(nums[i]%2!=0&&nums[i-1]%2!=0))
            {
                c++;
            }
            cnt[i]=c;
        }
        for(int i=0;i<queries.length;i++)
        {
            int s= queries[i][0];
            int e= queries[i][1];
            if(cnt[e]-cnt[s]==0)
            {
                ans[i]=true;
            }
            else 
            {
                ans[i]=false;
            }
        }
        
        return ans;
    }
}