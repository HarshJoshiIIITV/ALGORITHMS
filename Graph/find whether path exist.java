// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int A[][] = new int[n][n];
            String[] s = br.readLine().trim().split(" ", n * n);
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = Integer.parseInt(s[k]);
                    k++;
                }
            }

            Solution T = new Solution();
            System.out.println(T.is_possible(A, n));

            t--;
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    static int flag=0;
    public static void iterate(int M[][],int x,int y,int m,int n){
        if(x<0 || y<0 || x>=m || y>=n)
            return;
        if(M[x][y]==0)
            return;
        if(M[x][y]==2){
            flag=1;
            return;
        }
        M[x][y]=0;
        iterate(M,x+1,y,m,n);
        iterate(M,x,y+1,m,n);
        iterate(M,x-1,y,m,n);
        iterate(M,x,y-1,m,n);
    }
    public static int is_possible(int M[][], int m) {
        int s_x=0,s_y=0;
        int n=M[0].length;
        flag=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]==1){
                    s_x=i;
                    s_y=j;
                    break;
                }
            }
        }
        iterate(M,s_x,s_y,m,n);
        return flag;
    }
}