class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int start = 0;
        int arr[] = new int[3]; // To track occurrences of 'a', 'b', 'c'

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++; // Update frequency

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) { // Ensure all 'a', 'b', 'c' exist
                count += s.length() - i; // Count valid substrings
                arr[s.charAt(start) - 'a']--; // Shrink window from the left
                start++;
            }
        }
        return count;
    }
}
