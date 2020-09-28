import java.util.*;
public class Main
{
    public static void merge(int arr[],int l,int mid,int r){
        int left[]=new int[mid-l+1];
        int right[]=new int[r-mid];
        for(int i=l;i<=mid;i++){
            left[i-l]=arr[i];
        }
        for(int i=mid+1;i<=r;i++){
           right[i-mid-1]=arr[i]; 
        }
        int pl=0,pr=0,pk=l;
        while(pl<(mid-l+1) && pr<(r-mid)){
            if(left[pl]<right[pr]){
                arr[pk]=left[pl];
                pl++;
                pk++;
            }   
            else{
                arr[pk]=right[pr];
                pr++;
                pk++;
            }
        }
        while(pl<(mid-l+1)){
             arr[pk]=left[pl];
                pl++;
                pk++;
            
        }
        while(pk<(r-mid)){
            arr[pk]=right[pr];
            pr++;
            pk++;
        }
    }
    public static void mergesort(int arr[],int l,int r){
        if(l>=r)
            return;
        int mid=(l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		mergesort(arr,0,n-1);
		System.out.println();
		for(int i=0;i<n;i++){
		   System.out.print(arr[i]+" ");
		}
	}
}
