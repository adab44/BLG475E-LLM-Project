/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

class Solution {
    public String encode(String message) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        
        for (char c : message.toCharArray()) {
            char target = c;
            
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                // Replace with the letter 2 places ahead in the alphabet
                target = (char) (c + 2);
            }
            
            // Swap the case of the (potentially modified) character
            if (Character.isUpperCase(target)) {
                sb.append(Character.toLowerCase(target));
            } else if (Character.isLowerCase(target)) {
                sb.append(Character.toUpperCase(target));
            } else {
                // In case of non-alphabetic characters (though the prompt assumes letters)
                sb.append(target);
            }
        }
        
        return sb.toString();
    }
}