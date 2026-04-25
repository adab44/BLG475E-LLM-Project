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

## Refactoring - Round 2
**Date:** 2026-04-25

### Problem:
Base test FAILED - negative number digit sum calculated incorrectly.

### Prompt Sent:
Original HumanEval prompt + "The previous solution failed because negative numbers' digit sums were calculated incorrectly. For negative numbers, the first digit should be negative. Please fix this."

### Agent Response:
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
        String s = String.valueOf(n);
        int sum = 0;
        int startIdx = 0;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            startIdx = 1;
        }
        for (int i = startIdx; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (isNegative && i == startIdx) {
                sum -= digit;
            } else {
                sum += digit;
            }
        }
        return sum;
    }
}

### Notes:
Code fixed - negative first digit now handled correctly. All tests passed after refactoring.
