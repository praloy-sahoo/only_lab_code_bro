public class LargestPalindrome {

    // Method to check palindrome
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "Madam lives in level@radar 12321 test@noon!";

        // split using space or @
        String[] words = input.split("[ @]");

        String largestPalindrome = "";

        for (String word : words) {

            // remove non-alphanumeric characters
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            // ignore case
            word = word.toLowerCase();

            if (word.length() > 0 && isPalindrome(word)) {
                if (word.length() > largestPalindrome.length()) {
                    largestPalindrome = word;
                }
            }
        }

        System.out.println("Largest Palindrome Word: " + largestPalindrome);
    }
}
