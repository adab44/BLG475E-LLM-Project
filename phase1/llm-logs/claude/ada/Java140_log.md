# Log - Java/140 - fixSpaces
**LLM:** Claude (claude-sonnet-4-6)
**Date:** 2026-04-21

## Prompt Sent:
import java.util.*;
import java.lang.*;
class Solution {
    /**
    Given a string text, replace all spaces in it with underscores,
    and if a string has more than 2 consecutive spaces,
    then replace all consecutive spaces with -
    fixSpaces("Example") == "Example"
    fixSpaces("Example 1") == "Example_1"
    fixSpaces(" Example 2") == "_Example_2"
    fixSpaces(" Example   3") == "_Example-3"
     */
    public String fixSpaces(String text) {

## Agent Response:
import java.util.*;
import java.lang.*;
class Solution {
    public String fixSpaces(String text) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
                int count = 0;
                while (i < text.length() && text.charAt(i) == ' ') {
                    count++;
                    i++;
                }
                if (count >= 3) result.append('-');
                else for (int j = 0; j < count; j++) result.append('_');
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
