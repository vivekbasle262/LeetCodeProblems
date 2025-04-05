class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;
        int subsetCount = 1 << n;
        
        for (int i = 0; i < subsetCount; i++) {
            int xorSum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xorSum ^= nums[j];
                }
            }
            total += xorSum;
        }
        
        return total;
    }
}