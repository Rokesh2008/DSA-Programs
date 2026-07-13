class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new ArrayList<>(); int i;
        int lowLength = String.valueOf(low).length(), highLength = String.valueOf(high).length();
        for(int len = lowLength; len <= highLength; len++) {
            for(int start = 0; start + len <= digits.length(); start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if(num >= low && num <= high) result.add(num);
            }
        }
        return result;
    }
}