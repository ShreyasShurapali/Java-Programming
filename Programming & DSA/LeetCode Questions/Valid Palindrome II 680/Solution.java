class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }
}



// String: "abca"
// Index:   0123
//          ↑  ↑
//        left right
// Step 1: left = 0, right = 3
// text
// s.charAt(0) = 'a'
// s.charAt(3) = 'a'
// 'a' == 'a' ✓ (Match!)

// Action: Move pointers inward
// left++, right-- → left = 1, right = 2
// Step 2: left = 1, right = 2
// text
// s.charAt(1) = 'b'
// s.charAt(2) = 'c'  
// 'b' != 'c' ❌ (Mismatch!)

// Action: Try both options:
// return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
// return isPalindrome(s, 2, 2) || isPalindrome(s, 1, 1);
// Option 1: isPalindrome(s, 2, 2) - Skip left character 'b'

// text
// String: "abca" → Check substring "c" (just index 2)
// left = 2, right = 2
// left >= right → Return true (single character is palindrome)
// Option 2: isPalindrome(s, 1, 1) - Skip right character 'c'

// text
// String: "abca" → Check substring "b" (just index 1)  
// left = 1, right = 1
// left >= right → Return true (single character is palindrome)
// Result: true || true = true ✅