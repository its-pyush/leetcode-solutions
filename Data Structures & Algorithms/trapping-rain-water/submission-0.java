class Solution {
    public int trap(int[] height)
    {
        // left and right pointer
        //start max L and max R with extremes
        // smaller pointer moves.
        // checks with max P and subtract height on poinnter

        int left = 0;
        int right = height.length-1;
        int maxL = height[left];
        int maxR = height[right];
        int trapped = 0;
        if(height.length == 0)
        return 0;

        while(left<right)
        {
            if(height[left]<=height[right])
            {
                maxL = Math.max(maxL,height[left]);
                trapped += maxL-height[left]<0? 0:maxL-height[left];
                left++;
            }
            else
            {
                //right side is bigger
                maxR = Math.max(maxR,height[right]);
                trapped+= maxR-height[right]<0?0:maxR-height[right];
                right--;
            }
        }
        return trapped;
    }
}
