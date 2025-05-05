package dev.rama27.Task.String;

public class CountVowelsConsonants {
    public int[] countvowelsConsonants(String s){
        int vowelCount = 0;
        int consonantCount = 0;

        if (s == null || s.isEmpty()) {
            return null;
        }

        String lowercase = s.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char ch = lowercase.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[]{vowelCount,consonantCount};

        }

}
