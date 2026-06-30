import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            // FIX 1: Use .equals("C") instead of == 'C'
            if (op.equals("C") && !st.isEmpty()) {
                int removed = st.pop();
                sum -= removed; // Fix: Subtract the actual removed score, not operations[i-1]
            } 
            // FIX 2: Use .equals("D") instead of == 'D'
            else if (op.equals("D") && !st.isEmpty()) {
                int x = st.peek() * 2;
                st.push(x);
                sum += x;
            } 
            // FIX 3: Use .equals("+") instead of == '+'
            else if (op.equals("+") && !st.isEmpty()) {
                int temp = st.pop();
                int z = temp + st.peek();
                st.push(temp);
                st.push(z);
                sum += z;
            } 
            // FIX 4: Correct logic for numbers. 
            // The original condition (op != "C" || ...) was always true.
            // We also must parse the String to an int.
            else {
                int score = Integer.parseInt(op);
                st.push(score);
                sum += score;
            }
        }
        return sum;
    }
}   
