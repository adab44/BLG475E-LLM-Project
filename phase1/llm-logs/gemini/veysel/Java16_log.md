# Log - Java/16 - countDistinctCharacters
**LLM:** Gemini (gemini-3-flash)
**Date:** 2026-04-24

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> countDistinctCharacters("xyzXYZ")
    3
    >>> countDistinctCharacters("Jerry")
    4
     */
    public int countDistinctCharacters(String string) {

## Agent Response:

public int countDistinctCharacters(String string) {
        // Handle null or empty input
        if (string == null || string.isEmpty()) {
            return 0;
        }

        // Convert to lowercase to ignore case sensitivity
        String lowerString = string.toLowerCase();
        
        // Use a Set to store unique characters
        Set<Character> distinctChars = new HashSet<>();
        
        for (char c : lowerString.toCharArray()) {
            distinctChars.add(c);
        }
        
        // The size of the set represents the count of distinct characters
        return distinctChars.size();
    }
}
## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
