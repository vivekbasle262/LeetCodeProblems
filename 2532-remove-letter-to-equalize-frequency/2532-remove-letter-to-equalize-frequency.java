class Solution {
    public boolean equalFrequency(String s) {
       int arr[]=new int[26];
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        arr[ch-'a']++;
       }
       for(int i=0;i<26;i++)
       {
        arr[i]--;
        if(checkcount(arr))
        {
            return true;
        }
        arr[i]++;
       }
       return false;
    }
    private boolean checkcount(int data[])
       {
        int lastCount = 0;
        for (int count: data){
            if (count == 0) continue;
            if (lastCount != 0 && count != lastCount) return false;
            lastCount = count;
        }
        return true;

       }


    
}