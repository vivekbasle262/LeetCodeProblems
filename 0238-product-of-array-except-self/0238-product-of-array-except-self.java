class Solution {
    public int[] productExceptSelf(int[] nums) {
       int []product=new int[nums.length];
       product[0]=1;
       for(int i=1;i<nums.length;i++)
       {
        product[i]=product[i-1]*nums[i-1];
       }    
       int suffixproduct=1;
       for(int i=nums.length-1;i>0;i--)
       {
        suffixproduct*=nums[i];
        product[i-1]=product[i-1]*suffixproduct;
       }
       return product;
    }
}