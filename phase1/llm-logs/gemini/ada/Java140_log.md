# Log - Java/140 - fixSpaces
**LLM:** Gemini
**Date:** 2026-04-22

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
        String result = text.replaceAll(" {3,}", "-");
        result = result.replace(" ", "_");
        return result;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
