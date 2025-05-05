package dev.rama27.Task.String;

public class RemoveWhiteSpace {
    public String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\s+", "");
    }


}
