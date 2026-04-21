/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public String fixSpaces(String text) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
                int count = 0;
                while (i < text.length() && text.charAt(i) == ' ') {
                    count++;
                    i++;
                }
                if (count >= 3) result.append('-');
                else for (int j = 0; j < count; j++) result.append('_');
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
