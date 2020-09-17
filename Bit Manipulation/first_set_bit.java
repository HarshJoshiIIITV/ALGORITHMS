
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    if(n==0){
		        System.out.println("0");
		     }
		    else{
		    int index=0;
		    int x=1;
        	while((n&x)==0){
        	    index++;
        	    x=x<<1;
        	}
		    System.out.println(index+1);
		    }
		}
	}
}