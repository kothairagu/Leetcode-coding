class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                if (count > 1) {
                    return false;
                }
                while (i < s.length() && s.charAt(i) == '1') {
                    i++;
                }
            }
        }
        return true;
    }
}
