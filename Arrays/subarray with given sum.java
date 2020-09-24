/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int k=in.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    Map<Integer,Integer>map=new HashMap<>();
            int sum=0,x=-1,y=-1;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum==k){
                    x=1;
                    y=i+1;
                    break;
                }
                else if(map.containsKey(sum-k)){
                    x=map.get(sum-k)+2;
                    y=i+1;
                    break;
                }
                else{
                    map.put(sum,i);
                }
            }
            if(x!=-1)
                System.out.println(x+" "+y);
            else
                System.out.println("-1");
		}
	}
}