# Log - Java/18 - howManyTimes
**LLM:** Claude (claude-sonnet-4-6)
**Date:** 2026-04-23

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {

## Agent Response:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Find how many times a given substring can be found in the original string. Count overlapping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {
        if (string.isEmpty() || substring.isEmpty() || substring.length() > string.length()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.startsWith(substring, i)) {
                count++;
            }
        }
        return count;
    }
}


## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
