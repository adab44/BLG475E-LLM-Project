# Log - Java/145 - orderByPoints
**LLM:** Claude (claude-sonnet-4-6)
**Date:** 2026-04-21

## Prompt Sent:
import java.util.*;
import java.lang.*;
class Solution {
    /**
    Write a function which sorts the given list of integers
    in ascending order according to the sum of their digits.
    Note: if there are several items with similar sum of their digits,
    order them based on their index in original list.
    For example:
    >>> orderByPoints(Arrays.asList(1, 11, -1, -11, -12)) == [-1, -11, 1, -12, 11]
    >>> orderByPoints(Arrays.asList()) == []
     */
    public List<Integer> orderByPoints(List<Integer> nums) {

## Agent Response:
import java.util.*;
import java.lang.*;
class Solution {
    public List<Integer> orderByPoints(List<Integer> nums) {
        List<Integer> result = new ArrayList<>(nums);
        result.sort(Comparator.comparingInt(this::digitSum));
        return result;
    }
    private int digitSum(int n) {
        String s = String.valueOf(Math.abs(n));
        int sum = 0;
        for (char c : s.toCharArray()) sum += c - '0';
        return n < 0 ? sum - 2 * (s.charAt(0) - '0') : sum;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
