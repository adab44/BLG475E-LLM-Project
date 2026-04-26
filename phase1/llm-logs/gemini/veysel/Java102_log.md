# Log - Java/102 - chooseNum
**LLM:** Gemini (gemini-3-flash)
**Date:** 2026-04-24

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    This function takes two positive numbers x and y and returns the
    biggest even integer number that is in the range [x, y] inclusive. If
    there's no such number, then the function should return -1.
    
    For example:
    chooseNum(12, 15) = 14
    chooseNum(13, 12) = -1
     */
    public int chooseNum(int x, int y) {


## Agent Response:

public int chooseNum(int x, int y) {
        // If the range is invalid, return -1
        if (x > y) {
            return -1;
        }
        
        // If the largest number in the range (y) is even, return it
        if (y % 2 == 0) {
            return y;
        }
        
        // If y is odd, the next largest number is y - 1
        // We check if y - 1 is still within the range [x, y]
        if (y - 1 >= x) {
            return y - 1;
        }
        
        // If no even number was found in the range
        return -1;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
