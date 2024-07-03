//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean issafe(boolean g[][],int v,int c[],int cin,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(g[v][i] && cin==c[i]) return false;
        }
        return true;
    }
    public boolean graphColoring(boolean g[][], int m, int n) {
        // Your code here
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=0;
        }
        
        if(solve(g,m,c,0,n))
        {
            return true;
        }
        else return false;
    }
    public boolean solve(boolean g[][],int m,int c[],int v,int n)
    {
        if(v==n) return true;
        for(int i=1;i<=m;i++)
        {
            if(issafe(g,v,c,i,n))
            {
                c[v]=i;
            if(solve(g,m,c,v+1,n)) return true;
            c[v]=0;
            }
        }
        return false;
    }
}