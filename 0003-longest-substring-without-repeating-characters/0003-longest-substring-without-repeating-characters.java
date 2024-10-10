class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
     int i=0;
     int res=0;
     
     HashMap<Character,Integer>mp=new HashMap();
     for(int j=0;j<n;j++)
     {
        if(mp.containsKey(s.charAt(j)))
        {
            i=Math.max(i,mp.get(s.charAt(j))+1);
        }
        res=Math.max(res,j-i+1);
        mp.put(s.charAt(j),j);
     }
     return res;
    }
}