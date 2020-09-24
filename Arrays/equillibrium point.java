#include<iostream>
using namespace std;
int main()
 {
	int t,n,i;
	cin>>t;
	while(t--){
	    cin>>n;
	    int arr[n];
	    int sum=0;
	    int localsum=0;
	    for(i=0;i<n;i++){
	        cin>>arr[i];
	        sum+=arr[i];
	    }
	    for(i=0;i<n;i++){
	        if(localsum==sum-localsum-arr[i]){
	            cout<<(i+1)<<endl;
	            break;   
	        }
	       localsum+=arr[i];
	    }
	    if(i==n)
	        cout<<"-1"<<endl;
	    
	    
	}
	return 0;
}