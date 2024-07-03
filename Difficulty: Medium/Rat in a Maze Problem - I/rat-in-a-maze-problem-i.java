//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
     ArrayList<String> ans=new ArrayList<>();
     int vis[][]=new int[n][n];
     int di[]={1,0,0,-1};
     int dj[]={0,-1,1,0};
     
     if(m[0][0]==1) solve(0,0,m,n,ans,"",vis,di,dj);
     return ans;
    }
    public static void solve(int i,int j,int [][] m,int n,ArrayList<String> ans,String move,int vis[][],int di[],int dj[])
    {
        if(i==n-1 && j==n-1) ans.add(move);
        String dir="DLRU";
        for(int p=0;p<4;p++)
        {
            int ni=i+di[p];
            int nj=j+dj[p];
            if(ni>=0 && nj>=0 && ni<n && nj<n && vis[ni][nj]!=1 && m[ni][nj]==1)
            {
                vis[i][j]=1;
                solve(ni,nj,m,n,ans,move+dir.charAt(p),vis,di,dj);
                vis[i][j]=0;
            }
        }
    }
}