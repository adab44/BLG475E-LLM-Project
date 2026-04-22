# Log - Java/154 - cycpatternCheck
**LLM:** Gemini
**Date:** 2026-04-22

## Prompt Sent:
import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    cycpatternCheck("abcd","abd") => false
    cycpatternCheck("hello","ell") => true
    cycpatternCheck("whassup","psus") => false
    cycpatternCheck("abab","baa") => true
    cycpatternCheck("efef","eeff") => false
    cycpatternCheck("himenss","simen") => true
     */
    public boolean cycpatternCheck(String a, String b) {

## Agent Response:
import java.util.*;
import java.lang.*;
class Solution {
    public boolean cycpatternCheck(String a, String b) {
        int n = b.length();
        String combined = b + b;
        for (int i = 0; i < n; i++) {
            String rotation = combined.substring(i, i + n);
            if (a.contains(rotation)) return true;
        }
        return false;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
