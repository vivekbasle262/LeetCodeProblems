class Solution {
    public boolean isPalindrome(int x) {

      String s=String.valueOf(x);
      char arr[]=s.toCharArray();
      int low=0;
      int high=arr.length-1;
      while(low<=high)
      {
        if(s.charAt(low)!=s.charAt(high))
        {
            return false;
        }
        low++;
        high--;
      } 
      return true;
    }
}