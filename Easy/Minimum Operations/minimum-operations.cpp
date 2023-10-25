class Solution
{
  public:
    int minOperation(int n)
    {
        //code here.
          if(n==0) return 0;
        
        if(n%2==0){
            return (minOperation(n/2)+1);
        }
        else{
            return (minOperation(n-1)+1);
        }
    }
};//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	    {
	        int n;
	        cin>>n;
	        Solution ob;
	        cout<<ob.minOperation(n)<<endl;
	    }
}
// } Driver Code Ends