class Solution {
    public int minSubarray(int[] nums, int p) {
        long psum=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
        }
        int rem=(int)(psum%p);
        if(rem==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        long sum=0;
        int minl=nums.length;
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            int curmod=(int)(sum%p);
            int tarmod=(curmod-rem+p)%p;
            if(map.containsKey(tarmod)){
                minl=Math.min(minl,i-map.get(tarmod));
            }
            map.put(curmod,i);
        }
        return minl==nums.length?-1:minl;
    }
}