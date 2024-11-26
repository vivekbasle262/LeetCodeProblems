class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans=new StringBuilder();
        int len1=strs[0].length();
        int len2=strs[strs.length-1].length();
        for(int i=0;i<Math.min(len1,len2);i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                    ans.append(strs[0].charAt(i));
            }
            else{
                break;
            }
        }
        return ans.toString();
        
    }
}