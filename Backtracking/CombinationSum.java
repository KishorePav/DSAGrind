package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> tempList,
            List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                tempList.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}

// Leetcode question link:
// https://leetcode.com/problems/combination-sum/
