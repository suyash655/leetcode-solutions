class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int k = nums2.length;
        int[] arr = new int[n + k];
        
        // Merge arrays
        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n + i] = nums2[i];
        }
        
        Arrays.sort(arr);
        int e = arr.length;
        
        if (e % 2 == 0) {
            return (arr[e/2 - 1] + arr[e/2]) / 2.0;  // Cast to double
        } else {
            return arr[e/2];
        }
    }
}   
