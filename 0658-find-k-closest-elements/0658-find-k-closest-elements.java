class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      int l = 0, r = arr.length-1;
        while(r - l >= k){
            if(Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) r--;
            else    l++;
        }
        List<Integer> list = Arrays.stream(Arrays.copyOfRange(arr,l,r+1)).boxed().toList();
        return list;
        
    }
}