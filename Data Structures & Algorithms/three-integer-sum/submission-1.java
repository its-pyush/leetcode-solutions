class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
        int n =nums.length;
        Arrays.sort(nums); //sorted array
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-2;i++) //need to go till the 3rd last element
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            //two pointer
            int left = i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));


                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right --;

                left++;
                right --;
                }
                else if(sum<0) //bigger element needed
                {
                    left++;
                }
                else{
                    //smaller element needed
                    right--;
                }
            }




        }
        return result;

    }
}
