
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequency of each number
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Map frequency -> list of numbers
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> rank = new ArrayList<>();

        for (int num : freq.keySet()) {
            int count = freq.get(num);

            if (!map.containsKey(count)) {
                map.put(count, new ArrayList<>());
                rank.add(count);
            }

            map.get(count).add(num);
        }

        Collections.sort(rank);

        int[] ans = new int[k];
        int index = 0;

        for (int i = rank.size() - 1; i >= 0 && index < k; i--) {
            for (int num : map.get(rank.get(i))) {
                ans[index++] = num;
                if (index == k) break;
            }
        }

        return ans;
    }
}