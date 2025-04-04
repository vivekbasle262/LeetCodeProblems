class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int max=0;
        int[] v = new int[s.length()];
        int k=0;
        for (char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
            v[k++] = map.get(i);
            max=Math.max(max,map.get(i));
        }
     
        if(max==1)
        {
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < v.length; i++) 
            if (v[i] == max) 
                sb.append(s.charAt(i));
        return sb.toString();
        
    }
}