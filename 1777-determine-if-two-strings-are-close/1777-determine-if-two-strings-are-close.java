class Solution {
    public boolean closeStrings(String w1, String w2) {
        int a[]=new int[26];
        int b[]=new int[26];
          for(char ch:w1.toCharArray()) {a[ch-'a']++;}
         for(char ch:w2.toCharArray()) {b[ch-'a']++;}
         for(int i = 0; i < 26; i++){
         if(a[i]==0 && b[i]!=0 || a[i]!=0 && b[i]==0)return false;}
         Arrays.sort(a);
         Arrays.sort(b);
         for(int i=0;i<26;i++)
         {
             if (a[i]!=b[i])return false;
         }
         return true;
    }
}

//asli khud