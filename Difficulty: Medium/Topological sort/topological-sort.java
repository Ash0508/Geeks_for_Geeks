//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int result[]=new int[V];
        boolean vis[]=new boolean[V];
        Stack<Integer> s=new Stack<>();
        int i;
        for(i=0;i<V;i++){
            if(!vis[i]){
                topSortUtil(adj,vis,i,s);
            }
        }
        i=0;
        while(!s.isEmpty()){
            result[i++]=s.pop();
        }
        return result;
    }
    static void topSortUtil(ArrayList<ArrayList<Integer>> adj, boolean vis[], int curr, Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            int next=adj.get(curr).get(i);
            if(!vis[next]){
                topSortUtil(adj,vis,next,s);
            }
        }
        s.push(curr);
    }
    
}
