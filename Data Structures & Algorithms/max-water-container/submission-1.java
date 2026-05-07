class Solution {
    public int maxArea(int[] heights) 
    {
        int left = 0; //left pointer
        int right = heights.length-1; //right pointer
        int area = 0;
        while(left<right)
        {
            int currArea = Math.min(heights[left],heights[right]) * (right-left);
             area = (int)Math.max(area,currArea);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return area;
        
    }
}
