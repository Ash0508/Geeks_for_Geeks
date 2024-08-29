//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
    return mergeSortAndCount(arr, 0, n - 1);
}

static long mergeSortAndCount(long[] arr, int left, int right) {
    if (left >= right) return 0;
    int mid = left + (right - left) / 2;
    return mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right) + mergeAndCount(arr, left, mid, right);
}

static long mergeAndCount(long[] arr, int left, int mid, int right) {
    long[] leftArr = java.util.Arrays.copyOfRange(arr, left, mid + 1);
    long[] rightArr = java.util.Arrays.copyOfRange(arr, mid + 1, right + 1);
    int i = 0, j = 0, k = left;
    long count = 0;
    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
        else { arr[k++] = rightArr[j++]; count += (mid + 1) - (left + i); }
    }
    while (i < leftArr.length) arr[k++] = leftArr[i++];
    while (j < rightArr.length) arr[k++] = rightArr[j++];
    return count;
}

}