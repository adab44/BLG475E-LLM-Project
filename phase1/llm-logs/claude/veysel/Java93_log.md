# Log - Java/93 - encode
**LLM:** Claude (claude-sonnet-4-6)
**Date:** 2026-04-23

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


## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
