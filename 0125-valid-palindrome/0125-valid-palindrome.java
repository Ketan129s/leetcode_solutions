class Solution {
    public boolean isPalindrome(String s) {
        
        String ready="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                ready+=Character.toLowerCase(ch);
            }
        }
        int left=0;
        int right=ready.length()-1;
        while(left<right)
        {
            if(ready.charAt(left)!=ready.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}