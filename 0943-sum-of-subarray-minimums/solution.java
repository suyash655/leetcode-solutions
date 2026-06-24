import java.util.Stack;

class Solution {
    private int[] pse(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // Strictly greater: stops at the first element <= arr[i]
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

    private int[] nse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            // Greater or equal: stops at the first element < arr[i]
            // This prevents double counting duplicates by letting the leftmost element handle the range
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        int n = arr.length;
        int mod = (int) 1e9 + 7;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            
            // Fix: Use long for total to prevent overflow
            long total = left * right; 
            
            // Calculate contribution
            long val = (total * arr[i]) % mod;
            
            sum = (sum + val) % mod;
        }
        return (int) sum;
    }
}   
