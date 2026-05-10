class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        // array of the size of nums.length
        // store value in index count
        // array storing arraylist
        //hashmap for counting the frequency
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums)
        freq.put(num,freq.getOrDefault(num,0)+1);

        List<Integer>[] buckets = new List[nums.length+1];

        int[] count = new int[nums.length];
        for(int i = 0 ; i<buckets.length;i++)
        {  
            buckets[i] = new ArrayList<>();

        }
        for(int num : freq.keySet()){
            int frequency = freq.get(num);
            buckets[frequency].add(num);
        }
            
            int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) 
        {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }


        return new int[] {};
        
    }
}
