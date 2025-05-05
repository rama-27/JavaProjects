package dev.rama27.Task.String;

public class ReplaceOrSplitString {
    public String replaceSubstring(String str, String target, String replacement) {
        if (str == null || target == null || replacement == null) {
            return str;
        }
        return str.replace(target, replacement);
    }

    public String[] splitString(String str, String delimiter) {
        if (str == null || delimiter == null) {
            return new String[0];
        }
        return str.split(delimiter);
    }
}
