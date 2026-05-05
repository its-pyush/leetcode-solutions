class Solution {
    //two pointer question
    public int[] twoSum(int[] numbers, int target) 
    {
        int left = 0; //first index
        int right = numbers.length-1; //last index
        //sum of both pointer values
        while(left<right)
        {
            if(numbers[left]+numbers[right]>target)
                right--;
            else if(numbers[left]+numbers[right]<target)
                left++;

            else if(numbers[left]+numbers[right]==target)
                return new int[] {left+1,right+1}; // array indexing from 1
        }
        return new int[]{};
        
        
        }
        
    }

