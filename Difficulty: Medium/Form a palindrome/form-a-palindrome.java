//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countMin(String str) {
        int n = str.length();
        int[][] arr = new int[n][n];
        
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int k = j + i - 1;
                
                if (str.charAt(j) == str.charAt(k)) {
                    arr[j][k] = arr[j + 1][k - 1];
                } else {
                    arr[j][k] = Math.min(arr[j + 1][k], arr[j][k - 1]) + 1;
                }
            }
        }
        
        return arr[0][n - 1];
    }
}
