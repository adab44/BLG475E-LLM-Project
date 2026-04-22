# Log - Java/145 - orderByPoints
**LLM:** Gemini
**Date:** 2026-04-22

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
class Solution {
    public List<Integer> orderByPoints(List<Integer> nums) {
        List<Integer> result = new ArrayList<>(nums);
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(getDigitSum(a), getDigitSum(b));
            }
        });
        return result;
    }
    private int getDigitSum(int n) {
        int sum = 0;
        int num = Math.abs(n);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. Base test FAILED - negative number digit sum calculation differs from expected behavior.
