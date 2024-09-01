//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class aToi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.atoi(str);

            System.out.println(num);
            t--;
        }
    }
}
// } Driver Code Ends


// User function template for JAVA

/*You are required to complete this method */
class Solution {
    public int atoi(String s) {
        char c[]=s.toCharArray();
        String ans="";
        for(int i=0;i<c.length;i++)
        {
            if((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i]<='Z'))
            return -1;
            else
            ans+=c[i];
        }
       if(ans.charAt(ans.length()-1)=='-')
       return -1;
       
       int i=Integer.parseInt(s);
       return i;
    }
}
