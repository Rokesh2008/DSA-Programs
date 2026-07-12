class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i : sorted) {
            if(!map.containsKey(i)) {
                map.put(i, rank);
                rank = rank + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}