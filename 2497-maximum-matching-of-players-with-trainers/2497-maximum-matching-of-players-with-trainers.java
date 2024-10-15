class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
       
        int low=0;
        int ans=0;
        int high=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
       while(low<players.length && high<trainers.length)
       {
        if(players[low]<=trainers[high])
        {
            ans++;
            low++;

        }
        high++;
       }
        return ans;
    }
}