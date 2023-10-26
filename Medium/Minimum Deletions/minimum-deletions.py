#User function Template for python3

class Solution:
    def minimumNumberOfDeletions(self, S):
        def longest_palindromic_subsequence_length(S):
            n = len(S)
            dp = [[0] * n for _ in range(n)]

            for i in range(n):
                dp[i][i] = 1

            for cl in range(2, n + 1):
                for i in range(n - cl + 1):
                    j = i + cl - 1
                    if S[i] == S[j]:
                        dp[i][j] = 2 + dp[i + 1][j - 1]
                    else:
                        dp[i][j] = max(dp[i][j - 1], dp[i + 1][j])

            return dp[0][n - 1]

        n = len(S)
        lps_length = longest_palindromic_subsequence_length(S)
        return n - lps_length
        # code here 


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=input()

        ob = Solution()
        print(ob.minimumNumberOfDeletions(S))
# } Driver Code Ends