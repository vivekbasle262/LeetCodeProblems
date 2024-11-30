class Solution {
    public int reverse(int x) {
         int revnum=0;
       
    while(x!=0)
    {
     if(revnum>Integer.MAX_VALUE/10 || revnum<Integer.MIN_VALUE/10)
            {
                return 0;
            }
        int digit=x%10;
         x=x/10;
        revnum=revnum*10+digit;
    }
        return revnum;
    }
}