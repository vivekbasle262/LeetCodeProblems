class Solution {
    public int maxVowels(String s, int k) {


        int count=0;
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int i=0,j=0;
        while(i<k)
        {
            if(set.contains(s.charAt(i)))
            {
                count++;
            }
            i++;
        }
      int maxcount=count;
        while(i<s.length())
        {
             if(set.contains(s.charAt(i)))
            {
                count++;
            }
            if(set.contains(s.charAt(j)))
            {
                count--;
            }
          maxcount=Math.max(count,maxcount);
           
            i++;
            j++;

        }
        return Math.max(maxcount,count);
        
    }
}