class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int n1 = needle.length();
        for(int i = 0; i <= n - n1; i++) { 
            int j;
            for(j = 0; j < n1; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j == n1) {
                return i;
            }
        }
        return -1;
    }
}
