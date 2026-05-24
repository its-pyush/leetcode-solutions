class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        return false;
        int[] alpha = new int[26]; // keep track of alphabets
        for(int i = 0; i<s.length();i++)
        {
            alpha[s.charAt(i)-'a']++; // string s
            alpha[t.charAt(i)-'a']--; // string t
        }
        for(int i : alpha)
        {
            if(i!=0)
            return false;
        }

        return true;


    }
}
