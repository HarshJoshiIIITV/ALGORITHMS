import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int count=0;
		    while(n!=0){
		        count++;
		         n=n&(n<<1);
		    }
		    System.out.println(count);
		}
	}
}