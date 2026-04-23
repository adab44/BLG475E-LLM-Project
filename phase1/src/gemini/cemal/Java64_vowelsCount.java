
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    int vowelsCount(String s) {
        String vowels = "aeiouAEIOU";
        int n_vowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                n_vowels += 1;
            }
        }
        if (s.length() > 0 && (s.charAt(s.length() - 1) == 'y' || s.charAt(s.length() - 1) == 'Y')) {
            n_vowels += 1;
        }
        return n_vowels;
    }
}
