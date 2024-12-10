class Solution {
    public int maximumLength(String s) {
       int len=-1;
       Map<String,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
         String single=""+s.charAt(i);
         map.put(single,map.getOrDefault(single,0)+1);
          for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                        break;
                }
                map.put(s.substring(i,j+1),map.getOrDefault(s.substring(i,j+1),0)+1); 
            }
        }
       for(Map.Entry<String,Integer> entry: map.entrySet()){
       if(entry.getValue()>=3){
              
                int max=entry.getKey().length();
                len=Math.max(len,max);
        }
    }

        return len;
    }
}