import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int count_setbit(int n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }    
        return count;
    }
    
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int count=0;
		    for(int i=1;i<=n;i++){
		        if(i==1 || i==2)
		            count+=1;
		        else
		            count+=count_setbit(i);
		    }
		    System.out.println(count);
		}
	}
}