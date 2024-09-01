//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
         HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X', 10);
        mp.put('L' ,50);
        mp.put('C', 100);
        mp.put('D' ,500);
        mp.put('M' ,1000);
        
        int n= str.length();
        int ans=0, last=0;
        for(int i=n-1; i>=0; i--){
            int ch = mp.get(str.charAt(i));
            if(ch >= last){
                ans+= ch;
                last= ch;
            }
            else{
                ans-= mp.get(str.charAt(i));
            } 
        }
        return ans;
    }
}