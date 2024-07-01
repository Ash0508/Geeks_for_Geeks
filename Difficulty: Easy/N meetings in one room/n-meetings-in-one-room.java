//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Meeting {
    
    
    int start, end, index;

    Meeting(int s, int e, int i) {
        this.start = s;
        this.end = e;
        this.index = i;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int s[], int e[], int n)
    {
        // add your code here
        List<Meeting> m=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            m.add(new Meeting(s[i],e[i],i+1));
        }
        
        m.sort(Comparator.comparingInt(me->me.end));
        
        List<Integer>sm=new ArrayList<>();
        int l=-1;
        
        
        for(Meeting meet:m)
        {
            if(meet.start>l)
            {
                sm.add(meet.index);
                l=meet.end;
            }
        }
        return sm.size();
        
}
}