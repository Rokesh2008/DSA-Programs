class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int len = s.length();
        int i = 0, j =len - 1;
        String vowels = "aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(word[i]) == -1){
                i++;
            }
            while(i<j && vowels.indexOf(word[j]) == -1){
                j--;
            }
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        String str = new String(word);
        return str;
    }
}