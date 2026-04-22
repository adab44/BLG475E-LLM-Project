# Log - Java/57 - monotonic
**LLM:** Gemini
**Date:** 2026-04-22

## Prompt Sent:
import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return True is list elements are monotonically increasing or decreasing.
    >>> monotonic(Arrays.asList(1, 2, 4, 20))
    true
    >>> monotonic(Arrays.asList(1, 20, 4, 10))
    false
    >>> monotonic(Arrays.asList(4, 1, 0, -10))
    true
     */
    public boolean monotonic(List<Integer> l) {

## Agent Response:
import java.util.*;
import java.lang.*;
class Solution {
    public boolean monotonic(List<Integer> l) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) > l.get(i + 1)) increasing = false;
            if (l.get(i) < l.get(i + 1)) decreasing = false;
        }
        return increasing || decreasing;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
