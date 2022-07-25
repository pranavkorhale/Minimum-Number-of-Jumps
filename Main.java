class Solution{
    static int minJumps(int[] arr){
        int max = 0;
        int halt = 0;
        int jump = 0;
        int n = arr.length;
        
        //corner cases...
        if(arr.length==1)
        {
            return 0;
        }
        
        if(arr[0]==0)
        {
            return -1;
        }
        
        //actual logic
        for(int i=0;i<n;i++)
        {
            max = Math.max(arr[i]+i,max);
       
            if(i==halt)
            {
                halt = max;
                jump++;
            }
            if(halt>=n-1)
            {
             return jump;   
            }
            
        }
             
        return -1;
            
        
        
    }
}
