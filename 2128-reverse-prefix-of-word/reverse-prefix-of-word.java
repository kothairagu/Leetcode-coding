
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch); // Find the index of the first occurrence of ch
        if (index != -1) {
            String temp = word.substring(0, index + 1);
            temp = new StringBuilder(temp).reverse().toString();
            return temp + word.substring(index + 1);
        }
        // If ch is not found, return the original word
        return word;
    }
}
