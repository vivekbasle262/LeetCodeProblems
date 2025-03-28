class Solution {
   
   public static int getCalBeauty(int freq[])
   {
    int maxFreq=Integer.MIN_VALUE;
    int minFreq=Integer.MAX_VALUE;
    for(int i=0;i<freq.length;i++)
    { 
        if(freq[i]>0)
        {
            maxFreq = Math.max(maxFreq, freq[i]);
            minFreq = Math.min(minFreq, freq[i]);

        }
        
    }
    return    maxFreq-minFreq;
   }

    public int beautySum(String s) {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                total+=getCalBeauty(freq);
            }
        }
        return total;
        
    }
}