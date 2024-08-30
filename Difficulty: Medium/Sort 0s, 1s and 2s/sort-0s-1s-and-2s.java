//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();

            for (String s : inputArray) {
                a.add(Integer.parseInt(s));
            }

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> a) {
        // code here
        int low=0,mid=0,high=a.size()-1;
        
        while(mid<=high)
        {
            if(a.get(mid)==0)
            {
                swap(a,mid,low);
                mid++;
                low++;
            }
            else if(a.get(mid)==1) mid++;
            else{
                swap(a,mid,high);
                high--;
            }
        }
    }
    public void swap(ArrayList<Integer> a,int i,int j)
    {
        int temp=a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
    }
}