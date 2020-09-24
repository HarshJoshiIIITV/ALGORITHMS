#include<iostream>
using namespace std;
int main()
 {
	int t,n,i;
	cin>>t;
	while(t--){
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	        cin>>arr[i];
	    int leader=-1;
	    for(i=n-1;i>=0;i--){
	        if(arr[i]>=leader)
	            leader=arr[i];
	        else
	            arr[i]=-2;
	    }
	    for(i=0;i<n;i++){
	        if(arr[i]!=-2)
	            cout<<arr[i]<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}