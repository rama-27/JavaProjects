package dev.rama27.Task.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class PermutationsOfString {
    public List<String> generatePermutations(String str) {
        final Set<String> resultSet = new HashSet<>();

        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }

        char[] arr = str.toCharArray();
        int n = arr.length;

        final Consumer<Integer>[] permuteRecursive = new Consumer[1];

        permuteRecursive[0] = index -> {
            if (index == n - 1) {
                resultSet.add(new String(arr));
                return;
            }
            for (int i = index; i < n; i++) {
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                permuteRecursive[0].accept(index + 1);

                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        };
        permuteRecursive[0].accept(0);
        return new ArrayList<>(resultSet);
    }

}
