import java.util.*;
public class Main
{
    public static int getpivot(int arr[],int l,int r){
        int h=l,i=l,temp=0,pivot=arr[r];
        while(h<r){
            if(arr[h]<pivot){
                if(h==i){
                    h++;
                    i++;
                }
                else{
                    temp=arr[h];
                    arr[h]=arr[i];
                    arr[i]=temp;
                    i++;
                    h++;
                }
            }
            else{
                h++;
            }
        }
        temp=arr[r];
        arr[r]=arr[i];
        arr[i]=temp;
        return i;
        
    }
    public static void quicksort(int arr[],int l,int r){
        if(l>=r)
            return;
        int index=getpivot(arr,l,r);
        quicksort(arr,l,index-1);
        quicksort(arr,index+1,r);
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		quicksort(arr,0,n-1);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}