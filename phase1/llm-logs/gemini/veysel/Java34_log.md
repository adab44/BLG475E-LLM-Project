# Log - Java/34 - uniqueSorted
**LLM:** Gemini (gemini-3-flash)
**Date:** 2026-04-24

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return sorted unique elements in a list
    >>> unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
    [0, 2, 3, 5, 9, 123]
     */
    public List<Integer> unique(List<Integer> l) {

## Agent Response:

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    /**
    Return sorted unique elements in a list
    >>> unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
    [0, 2, 3, 5, 9, 123]
     */
    public List<Integer> unique(List<Integer> l) {
        if (l == null) {
            return new ArrayList<>();
        }
        
        return l.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
