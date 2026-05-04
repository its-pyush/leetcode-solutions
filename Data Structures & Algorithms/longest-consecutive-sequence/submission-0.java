class Solution {
    public int longestConsecutive(int[] nums) 
    {

        if(nums.length == 0)
        return 0; 

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int count =0;
        for(int num : nums)
        {
        
            if(!set.contains(num-1))
            {
            int curr = num;
            int currCount =1;
            
            while(set.contains(curr+1))
            {
                curr++;
                currCount++;
            }
            count = Math.max(count,currCount);

        }
        }
        return count;
}
}