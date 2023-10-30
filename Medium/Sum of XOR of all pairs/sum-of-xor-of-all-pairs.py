#User function Template for python3

import math

class Solution:
    def sumXOR (self, arr, n) : 
        #Complete the function
        _sum=0
        high = int(math.log2(max(arr))+1)
        for i in range(high):
            set_bit=0
            for j in arr:
                if (j&(1<<i)):
                    set_bit+=1
            _sum+=(set_bit*(n-set_bit)*(1<<i))
        return _sum
        #Complete the function
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3



for _ in range(0,int(input())):
    
    n = int(input())
    arr = list(map(int,input().strip().split()))
    ob = Solution()
    res = ob.sumXOR(arr, n)
    print(res)


# } Driver Code Ends