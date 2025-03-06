class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
           if(nums1[i][0]==nums2[j][0])
           {
            list.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
            i++;
            j++;
           }
           else if(nums1[i][0]>nums2[j][0])
           {
            list.add(nums2[j]);
            j++;
           }
           else{
            list.add(nums1[i]);
            i++;
           }
        }
        while(i<nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            list.add(nums2[j]);
            j++;
        }

        return list.toArray(new int[list.size()][]);
    }
}