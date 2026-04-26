# Log - Java/87 - getRow
**LLM:** Gemini (gemini-3-flash)
**Date:** 2026-04-24

## Prompt Sent:

import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of lists, [[x1, y1], [x2, y2] ...] such that
    each list is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by rows in ascending order.
    Also, sort coordinates of the row by columns in descending order.

    Examples:
    getRow([
      [1,2,3,4,5,6],
      [1,2,3,4,1,6],
      [1,2,3,4,5,1]
    ], 1) == [[0, 0], [1, 4], [1, 0], [2, 5], [2, 0]]
    getRow([], 1) == []
    getRow([[], [1], [1, 2, 3]], 3) == [[2, 2]]
     */
    public List<List<Integer>> getRow(List<List<Integer>> lst, int x) {

        
## Agent Response:

public List<List<Integer>> getRow(List<List<Integer>> lst, int x) {
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through each row (Ascending order)
        for (int i = 0; i < lst.size(); i++) {
            List<Integer> row = lst.get(i);
            List<Integer> columnIndices = new ArrayList<>();

            // Find all columns in the current row that match x
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) == x) {
                    columnIndices.add(j);
                }
            }

            // Sort column indices in descending order for the current row
            Collections.sort(columnIndices, Collections.reverseOrder());

            // Add the coordinates [row, col] to the result list
            for (int col : columnIndices) {
                result.add(Arrays.asList(i, col));
            }
        }

        return result;
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. All base tests passed.
