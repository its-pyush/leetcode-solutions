class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {

        HashMap<String,ArrayList<String>> ans = new HashMap<>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if(ans.containsKey(key))
            {
               ans.get(key).add(s);
               continue;
            }
            ans.put(key,new ArrayList<>());
            ans.get(key).add(s);

        }
        return new ArrayList<>(ans.values());
        
    
        
    }
}
