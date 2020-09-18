class Solution{
    static int findSingle(int N, int arr[]){
        int xor=0;
        for(int i=0;i<N;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}