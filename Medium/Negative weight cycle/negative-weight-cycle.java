//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            Solution obj = new Solution();
            int ans = obj.isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    // public int isNegativeWeightCycle(int n, int[][] e) {
    //     int[] d = new int[n];
    //     Arrays.fill(d, Integer.MAX_VALUE);
    //     d[0] = 0;

    //     // Run Bellman-Ford algorithm for n-1 iterations
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < e.length; j++) {
    //             int src = e[j][0];
    //             int dest = e[j][1];
    //             int wt = e[j][2];
    //             if (d[src] != Integer.MAX_VALUE && d[src] + wt < d[dest]) {
    //                 d[dest] = d[src] + wt;
    //             }
    //         }
    //     }

    //     // Check for negative weight cycle
    //     for (int j = 0; j < e.length; j++) {
    //         int src = e[j][0];
    //         int dest = e[j][1];
    //         int wt = e[j][2];
    //         if (d[src] != Integer.MAX_VALUE && d[src] + wt < d[dest]) {
    //             return 1;
    //         }
    //     }

    //     return 0; // No negative weight cycle found
    // }
    
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        final int e = edges.length;
        
        final int[] dist = new int[n];
        final int startingNode  = 0;
        dist[startingNode] = 0; 
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < e; ++j) {
                final int source = edges[j][0];
                final int target = edges[j][1];
                final int weight = edges[j][2];
                if (dist[source] != Integer.MAX_VALUE && dist[source] + weight <  dist[target]) {
                    if (i == n - 1) {
                        return 1;
                    }
                    dist[target] = dist[source] + weight;
                }
            }
        }
        
        return 0;
    }
}