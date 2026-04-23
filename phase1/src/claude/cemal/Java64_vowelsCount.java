
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    int vowelsCount(String s) {
        int count = 0;
        String lower = s.toLowerCase();
        String vowels = "aeiou";

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        if (lower.charAt(lower.length() - 1) == 'y') {
            count++;
        }

        return count;
    }
}