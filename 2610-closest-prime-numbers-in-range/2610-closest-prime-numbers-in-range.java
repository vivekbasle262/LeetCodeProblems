class Solution {

    public static boolean checkPrime(int val)
    {
        if(val==1) return false;  
        else if(val==2) return true; 
        for(int i=2; i<Math.sqrt(val)+1; i++){
            if(val%i==0){
                return false;
            }
        }
        
        return true;
    }
    public int[] closestPrimes(int low, int high) {
     int arr[]=new int[2];
     arr[0]=-1;
     arr[1]=-1;
        List<Integer>list=new ArrayList<>();
        int k=1;
        int mindiff=Integer.MAX_VALUE;
        while(low<=high)
        {
            if(checkPrime(low))
            {
                list.add(low);
             if(list.size()>1)
            {
                int firstnum=list.get(k);
                int secondnum=list.get(k-1);
                k++;
                int diff=firstnum-secondnum;
                if(mindiff>diff && mindiff!=diff)
                {
                    mindiff=diff;
                    arr[0]=secondnum;
                    arr[1]=firstnum;
                }
            }
            }
            low++;

           
        }
        
      return arr;  
    }
}