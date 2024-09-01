//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        int res=0;
        for(int i=0;i<S.length();i++){
            if(map.containsKey(S.charAt(i))){
             j=Math.max(j,map.get(S.charAt(i))+1);
            }
            res=Math.max(res,i-j+1);
            map.put(S.charAt(i),i);
        }
        return res;  
    }
}