# Log - Java/93 - encode
**LLM:** Gemini (gemini-3-flash)
**Date:** 2026-04-24

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function that takes a message, and encodes in such a
    way that it swaps case of all letters, replaces all vowels in
    the message with the letter that appears 2 places ahead of that
    vowel in the english alphabet.
    Assume only letters.

    Examples:
    >>> encode("test")
    "TGST"
    >>> encode("This is a message")
    "tHKS KS C MGSSCGG"
     */
    public String encode(String message) {
        
## Agent Response:

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

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
