
class GfG {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        //1111000010
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                if(i+1>max)
                    max=i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                if(i-map.get(sum)>max)
                    max=i-map.get(sum);
            }
        }
        return max;
        
    }
}
