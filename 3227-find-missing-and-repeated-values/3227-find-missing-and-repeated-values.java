class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer>list=new ArrayList<>();
        int row=grid.length;
        int col=grid[0].length;
        int arr[]=new int[row*col];
        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               arr[k]=grid[i][j];
               k++;
            }
        }
        Arrays.sort(arr);
        int missing=0;
        int duplicate=0;
        int n=arr.length;
        int sum= ((n)*(n+1))/2;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
             duplicate=arr[i];   
             continue;
            }
            else{
                     sum=sum-arr[i];
            }
           
        }
        sum=sum-arr[n-1];
        missing=sum;
        return new int[]{duplicate,missing};
    }
}