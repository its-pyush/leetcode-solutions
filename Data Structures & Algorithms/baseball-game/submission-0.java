class Solution {
    public int calPoints(String[] operations) 
    {
        //initialise the stack
        Stack<Integer> stack = new Stack<>();
        for(String ch : operations)
        {
            if(ch.equals("+"))
            {
              stack.push(stack.get(stack.size()-1)+stack.get(stack.size()-2));
            }
            else if(ch.equals("C"))
            {
                stack.pop();
            }
            else if(ch.equals("D"))
            {
                int f = stack.peek();
                stack.push(f*2);
            }
            else{
            int x = Integer.parseInt(ch);
            stack.push(x);
            }
        }
        int sum = 0;
        while(!stack.isEmpty())
        {   sum = sum+stack.pop();

        }
        return sum;
        
    }
}