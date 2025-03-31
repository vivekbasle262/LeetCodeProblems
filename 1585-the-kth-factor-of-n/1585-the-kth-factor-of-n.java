class Solution {
    public int kthFactor(int n, int k) {
        List<Integer>list=new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(list.size()==k)
                {
                    return list.get(list.size()-1);
                }
            }

        }
        return -1;
        
    }
}