class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] part = text.split(" ");
        List<Character> lst = new ArrayList<>();
        for(char ch : brokenLetters.toCharArray()){
            lst.add(ch);
        }
        int count = 0;
        for(String s : part){
            int isthere = 0;
            for(char ch : s.toCharArray()){
                if(lst.contains(ch)){
                    isthere = 1;
                    break;
                }
            }
            if(isthere == 0)count++;
        }
        return count;
    }
}