class Solution {
  
  
    public List<Integer> countSmaller(int[] nums) {

        List<Integer>ans=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int num:nums)
        {
            arr.add(num);
        }
        Collections.sort(arr);
        for(int i=0;i<nums.length;i++)
        {
            int index=binarysearch(arr,nums[i]);
            ans.add(index);
            arr.remove(index);
        }
  return ans;
        
    }
     public int binarysearch(ArrayList<Integer>arr,int target)
   {
    int start=0;
    int end=arr.size()-1;
    int mid=0;
    while(start<=end)
    {
        mid=start+(end-start)/2;
      
        if(arr.get(mid)<target)
        {
            start=mid+1;
        }
        else{
            end= mid-1;
        }
    }
      if(arr.get(start) == target) return start;
        return mid;

   }

}