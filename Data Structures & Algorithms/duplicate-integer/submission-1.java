class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        for (int num : nums)
        {
            if (unique.containsKey(num)) return true;
            else unique.put(num, 0);
        }
        return false;
    }
}
