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
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=in.nextInt();
		    int count=0;
		    int flag=0;
		    for(int i=0;i<n;i++){
		        if(count==0){
		            count=1;
		            flag=arr[i];
		        }
		        else if(arr[i]==flag){
		            count++;
		        }
		        else{
		            count--;
		        }
		    }
		    count=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==flag)
		            count++;
		    }
		    if(count>n/2)
		        System.out.println(flag);
		    else
		        System.out.println("-1");
		}
	}
}