//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        int n=s.length();
        // s+=".";
        String temp="";
        String t="";
        for(int i=0;i<n;i++)
        {
           char ch=s.charAt(i);
           if(ch=='.')
           {
               temp=t+'.'+temp;
               t="";
           }
           else
           {
           t=t+ch;
           }
        }
        temp=t+'.'+temp;
        return temp.substring(0,temp.length()-1);
    }
}