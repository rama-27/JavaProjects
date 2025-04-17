package dev.rama27.LeetCode.String;

public class GcdOfStrings {
    public String gcdOfStrings(String s1,String s2){
        if(!(s1+s2).equals(s2+s1)){
            return "";
        }
        int len=gcdLength(s1.length(),s2.length());

        return s1.substring(0,len);
    }

    private int gcdLength(int a, int b) {
        if(b==0){
            return a;
        }
        else{
            return gcdLength(b,a%b);
        }
    }

}
