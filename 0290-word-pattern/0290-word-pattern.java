class Solution {
    public boolean wordPattern(String pattern, String s) {
        int len1 = pattern.length();
        String[] parts = s.split(" ");
        int len2 = parts.length;
        if(len1!=len2) return false;
        HashMap<Object, Integer> map = new HashMap<>();
        for(int i = 0; i<parts.length; i++){
            Integer p = map.put(pattern.charAt(i), i);
            Integer w = map.put(parts[i], i);
            if(!Objects.equals(p,w)){
                return false;
            }
        }
        return true;
    }
}