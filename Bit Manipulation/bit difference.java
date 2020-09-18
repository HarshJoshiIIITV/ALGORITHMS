
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int count(int x){
        int count=0;
        while(true){
            if(x==0){
                break;
            }
            else{
                count++;
                x=x&(x-1);
            }
        }
        return count;
    }
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int a=in.nextInt();
	        int b=in.nextInt();
	        System.out.println(count(a^b));
	    }
	}
}