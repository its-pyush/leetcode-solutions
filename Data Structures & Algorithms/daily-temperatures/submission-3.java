class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                int popIndex = stack.pop();
                output[popIndex] = i-popIndex;

            }
            stack.push(i);
        }
        return output;
    }
}
