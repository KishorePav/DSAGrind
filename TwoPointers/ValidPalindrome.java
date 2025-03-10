package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String cleanedString = sb.toString();
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return reversedString.equals(cleanedString);

    }

}

// Leetcode question link:
// https://leetcode.com/problems/valid-palindrome/description/