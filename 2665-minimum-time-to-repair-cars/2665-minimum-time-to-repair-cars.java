class Solution {

   public static boolean checkPaired(long mid,int ranks[],int cars)
   {
    long checkCar=0;

       for(int i=0;i<ranks.length;i++)
       {
         checkCar+=(long) Math.sqrt((double) mid / ranks[i]);
       }
       if(checkCar>=cars)
       {
        return true;
       }
       return false;
   }
    public static long search(long left,long right,int ranks[],int cars)
    {
        long ans=0;
         
         while(left<=right)
         {
            long mid=left+(right-left)/2;
            if(checkPaired(mid,ranks,cars))
            {
               ans=mid;
               right=mid-1; 
            }
            else{
                left=mid+1;
            }
         }
         return ans;
    }


    public long repairCars(int[] ranks, int cars) {
     if (ranks == null || ranks.length == 0 || cars <= 0) {
            return 0;
        }
      int sum=0;
      for(int rank:ranks)
      {
      sum=Math.max(sum,rank);
      }
      long left=0;
      long right=(long)sum*cars*cars;
      long ans=search(left,right,ranks,cars);
      return ans;
        
    }
}