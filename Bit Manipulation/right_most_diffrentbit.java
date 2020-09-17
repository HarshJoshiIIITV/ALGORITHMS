
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int m=in.nextInt();
		    int n=in.nextInt();
		    if(m==n){
		        System.out.println("-1");
		    }
		    else{
		        int flag=1;
		        int index=0;
		        while(true){
		           if((flag&m)!=(flag&n)){
		               System.out.println(index+1);
		               break;
		           }
		           else{
		               flag=flag<<1;
		               index++;
		           }
		        }
		    }
		}
	}
}