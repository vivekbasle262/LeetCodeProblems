class Solution {
    public String compressedString(String s) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && count<9)
            {
                count++;
            }
            else{
                sb.append(count);
                sb.append(s.charAt(i));
                count=1;
            }

        }
        sb.append(count);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
        
    }
}
