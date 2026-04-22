/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

class Solution {
    public String encode(String message) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        
        for (char c : message.toCharArray()) {
            // Swap case
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            
            // Replace vowels with letter 2 places ahead
            if (vowels.indexOf(c) != -1) {
                c = (char)(c + 2);
            }
            
            result.append(c);
        }
        
        return result.toString();
    }
}