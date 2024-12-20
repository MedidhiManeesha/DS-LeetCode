public class LongestPalinStr {
    static String longestPalindromicSubstring(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(str, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(str, i, i + 1);
            // Get the maximum length
            int len = Math.max(len1, len2);
            
            // Update the start and end indices if we found a longer palindrome
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        // Length of the palindrome found
        return right - left - 1; 
    }

    public static void main(String[] args) {
        String str1 = "forgeeksskeegfor";
        String str2 = "Geeks";
        String str3 = "abc";
        String str4 = "";

        System.out.println(longestPalindromicSubstring(str1));
        System.out.println(longestPalindromicSubstring(str2));
        System.out.println(longestPalindromicSubstring(str3));
        System.out.println(longestPalindromicSubstring(str4));
    }

}
