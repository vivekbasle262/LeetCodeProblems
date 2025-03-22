class Solution {
    public int equalPairs(int[][] grid) {
        int pairs=0;
        int n=grid[0].length;
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                sb.append('0'+grid[i][j]);

            }
            String s=sb.toString();
            map.put(s,map.getOrDefault(s,0)+1);

        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                sb.append('0'+grid[j][i]);

            }
            String s=sb.toString();
            if(map.containsKey(s))
            {
                ans+=map.get(s);
            }

        }
        return ans;

        
    }
}