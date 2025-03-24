class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int spell=spells.length;
        int potion=potions.length;
        Arrays.sort(potions);
        for(int i=0;i<spell;i++)
        {
            int count=0;
            int num=spells[i];
            int low=0;
           int high=potion-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if((long)num*potions[mid]>=success)
                {
                     high=mid-1;
                     count = potions.length - mid;
                }
                else{
                    low=mid+1;
                }

            }
            spells[i]=count;
        }
        return spells;
    }
}