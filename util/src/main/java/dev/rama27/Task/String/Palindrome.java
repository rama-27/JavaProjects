package dev.rama27.Task.String;

public class Palindrome {
    public boolean isPalindrome(String s){
        char[] chars=s.toCharArray();
        int n=chars.length;
        for(int i=0;i<n/2;i++){
            if(chars[i]!=chars[n-1-i])
                return false;
        }
        return true;
    }
}
