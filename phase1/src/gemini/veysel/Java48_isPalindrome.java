/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

class Solution {
    /**
    Checks if given string is a palindrome
    >>> isPalindrome("")
    true
    >>> isPalindrome("aba")
    true
    >>> isPalindrome("aaaaa")
    true
    >>> isPalindrome("zbcd")
    false
     */
    public boolean isPalindrome(String text) {
        // An empty string or a single character is a palindrome
        if (text == null) {
            return false;
        }
        
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            // If characters at both ends don't match, it's not a palindrome
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}