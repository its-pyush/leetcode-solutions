class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stack = new Stack<>();
        int n = operations.length;
        int a,b,c;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            String op = operations[i];
            if(op.equals("D"))
            {
                a = stack.pop();
                b = 2*a;
                stack.push(a);
                stack.push(b);
            }
            else if(op.equals("C"))
            {
                stack.pop();
            }
            else if(op.equals("+"))
            {
                a = stack.pop();
                b = stack.pop();
                c = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }

        }
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        return sum;
    }
}