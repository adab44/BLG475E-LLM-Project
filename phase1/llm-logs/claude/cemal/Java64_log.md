Log - Java/64 - vowelsCount
LLM: Sonnet 4.6
Date: 2026-04-23

## Prompt Sent:
```java
import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function vowelsCount which takes a string representing
    a word as input and returns the number of vowels in the string.
    Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
    vowel, but only when it is at the end of the given word.

    Example:
    >>> vowelsCount("abcde")
    2
    >>> vowelsCount("ACEDY")
    3
     */
    public int vowelsCount(String s) {
```

## Agent Response:
```java
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    int vowelsCount(String s) {
        int count = 0;
        String lower = s.toLowerCase();
        String vowels = "aeiou";

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        if (lower.length() > 0 && lower.charAt(lower.length() - 1) == 'y') {
            count++;
        }

        return count;
    }
}
```

Notes:
Original HumanEval prompt used without modification. All base tests passed.

