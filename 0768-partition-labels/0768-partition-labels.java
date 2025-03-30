class Solution {
    public List<Integer> partitionLabels(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']=i;
        }
        int start=0;
        int maxindex=0;
        List<Integer>ans=new ArrayList<>();
        for(int j=0;j<s.length();j++)
        {
            maxindex=Math.max(maxindex,arr[s.charAt(j)-'a']);
            if(maxindex==j)
            {
                ans.add(j-start+1);
                start=j+1;
            }


        }
        return ans;
    }
}