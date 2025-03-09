class Solution {

    public int lengthOfLongestSubstring(String s) {
        String biggest = "";
        int maxLength = 0;  

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            
            if (biggest.indexOf(character) != -1) {
                biggest = biggest.substring(biggest.indexOf(character) + 1);
            }
            
            biggest += character;
            maxLength = Math.max(maxLength, biggest.length());
        }

        return maxLength;
    }
}
