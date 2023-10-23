#User function Template for python3

class Solution:
    def palindromicPartition(self, S):
        n = len(S)
        dp = [[True for j in range(n)] for i in range(n)]

        for c in range(1, n):
            for i in range(n-c):
                j = i + c
                dp[i][j] = (S[i] == S[j] and dp[i+1][j-1])
        
        cuts = [-1] + [n]*n
        for i in range(1, n+1):
            for j in range(1, i+1):
                if dp[j-1][i-1]:
                    cuts[i] = min(cuts[i], cuts[j-1] + 1)

        return cuts[n] 


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range (t):
        string = input()
        
        ob = Solution()
        print(ob.palindromicPartition(string))
# } Driver Code Ends