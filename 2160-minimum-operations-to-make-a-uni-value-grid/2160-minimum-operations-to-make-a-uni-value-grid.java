class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length,n=grid[0].length;
        int arr[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              arr[k]=grid[i][j];
              k++;
            }
        }
        //2,4,6,8
        Arrays.sort(arr);
        int count=0;
        int mid=m*n/2;
        int val=arr[mid];
        for(int i=0;i<m*n;i++)
        {
            int ans=Math.abs(arr[i]-val);
            if(ans%x!=0)
            {
                return -1;
            }
            count+=ans/x;



        }


        return count;
    }
}