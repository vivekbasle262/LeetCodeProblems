class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int cwDistance = 0;
        int totalDistance = 0;

        for(int i=0; i<distance.length; i++){
            if(start < destination && (i >= start && i < destination)){
            cwDistance += distance[i];
            }

            if(start > destination && (i >= start || i < destination)){
                cwDistance += distance[i];
            }

            totalDistance += distance[i];
        }
        return Math.min(cwDistance, totalDistance-cwDistance);

    }
}