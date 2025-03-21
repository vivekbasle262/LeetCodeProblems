class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int i=0,j=n-1,max=Integer.MAX_VALUE,actual=0;
        while(i<j)
        {
            int base=j-i;
            int ht=Math.min(height[i],height[j]);
            max=base*ht;
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
            if(max>actual)
            {
                actual=max;
            }
        }
        return actual;
        
    }
}