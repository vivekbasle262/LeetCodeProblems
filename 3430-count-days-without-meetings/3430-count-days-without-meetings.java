class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int occupiedDays = 0, prevEnd = 0;
        for(int[] meeting: meetings){
            int start = meeting[0], end = meeting[1];

            if(start > prevEnd + 1){
               
                occupiedDays += (end - start + 1);
            } else if(end > prevEnd){
           
                occupiedDays += (end - prevEnd);
            }

            prevEnd = Math.max(prevEnd, end);
        }

        return days - occupiedDays;
    }
}