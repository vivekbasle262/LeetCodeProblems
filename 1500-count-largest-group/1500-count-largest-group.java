class Solution {
    public int countLargestGroup(int n) {

    Map<Integer,Integer> map=new HashMap<>();

    for(int i=1;i<=n;i++)
    {
        int sum=getDigitSum(i);
        map.put(sum,map.getOrDefault(sum,0)+1);
    }

int maxsize=0;
    for(int value:map.values())
    {
        maxsize=Math.max(value,maxsize);
    }
    int ans=0;
    for(int count:map.values())
    {
        if(count==maxsize)
        {
            ans++;
        }
    }
    return ans;
    }
    private int getDigitSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }


    
}