/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */

import java.util.*;
import java.lang.*;

class Solution {
    /**
    For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
    >>> flipCase("Hello")
    "hELLO"
     */
    public String flipCase(String string) {
        if (string == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                // If it's not a letter (digit, space, symbol), keep it as is
                sb.append(c);
            }
        }

        return sb.toString();
    }
}