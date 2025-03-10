import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNums = new HashSet<>();
        for (int num : nums) {
            if (!distinctNums.add(num)) {
                return true;
            }
        }
        return false;

    }
}

// Leetcode question link:
// https://leetcode.com/problems/contains-duplicate/