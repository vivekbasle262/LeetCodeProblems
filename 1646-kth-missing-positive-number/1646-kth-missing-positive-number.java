class Solution {
    public int findKthPositive(int[] arr, int k) {
       for(int ans : arr) 
        {
            if(ans<=k)
                k++;
            else
                break;
        }
        return k; 
    }
}