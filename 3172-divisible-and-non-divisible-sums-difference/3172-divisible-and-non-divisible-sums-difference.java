class Solution {
    public int differenceOfSums(int n, int m) {
        int sumnotdiv=0;
        int sumofdiv=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                sumofdiv+=i;
            }
            else{
                sumnotdiv+=i;
            }

        }
        return sumnotdiv-sumofdiv;
    }
}