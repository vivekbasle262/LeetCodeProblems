class Solution {
    public boolean findSubarrays(int[] nums) {
 Map<Long, Integer> map = new HashMap<>();
        
        int i=0, j=0; long sum = 0;
        while(j < nums.length) {
            
            sum += nums[j];
            
            if(j-i+1 < 2) j++;
            
            else if(j-i+1 == 2) {  
                if(map.containsKey(sum)) return true;
                else map.put(sum, map.getOrDefault(sum, 0) + 1);
                sum -= nums[i];
                j++; i++;
            }
        }
        
        return false;
    }
}