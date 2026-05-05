class Solution {
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            sb.append(c);

        }
        String forw = sb.toString();
        String rev = sb.reverse().toString();

        if(forw.equalsIgnoreCase(rev))
        return true;

        return false;

        
    }
}
