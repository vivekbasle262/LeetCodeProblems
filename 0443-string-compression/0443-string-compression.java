class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
         int count=1;
         if(chars.length==1)
         {
            return 1;
         }
         for(int i=0;i<chars.length-1;i++)
         {
            if(chars[i]==chars[i+1])
            {
                count++;
            }
            else{
                if(count==1)
                {
                    sb.append(chars[i]);
                }
               else{
                 sb.append(chars[i]);
                sb.append(count);
               }
                count=1;
            }
         }
        if(count==1)
        {
      sb.append(chars[chars.length-1]);
        }
        if(count>1)
        {
             sb.append(chars[chars.length-1]).append(count);
        }
         sb.toString();
         for(int k=0;k<sb.length();k++)
         {
            chars[k]=sb.charAt(k);
         }
         return sb.length();
       
    }
}