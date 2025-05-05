package dev.rama27.Task.String;

public class StringToInt {

    public int stringToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int n = s.length();

        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        int sign = 1;
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        int result = 0;
        int limit = Integer.MAX_VALUE / 10;
        int lastDigitLimit = Integer.MAX_VALUE % 10;

        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > limit || (result == limit && digit > lastDigitLimit)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

}
