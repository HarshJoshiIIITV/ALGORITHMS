#include<iostream>
using namespace std;
int main()
 {
	int t,n,x;
	cin>>t;
	while(t--){
	    cin>>n;
	    int sum=n*(n+1)/2;
	    for(int i=0;i<n-1;i++){
	        cin>>x;
	        sum-=x;
	    }
	    cout<<sum<<endl;
	    
	}
	return 0;
}