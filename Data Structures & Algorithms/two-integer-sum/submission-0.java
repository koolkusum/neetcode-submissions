class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> add= new HashMap();
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            if (add.containsKey(nums[i]))
            {
                solution[0] = add.get(nums[i]);
                solution[1] = i;
            }
            else add.put(target-nums[i], i);
        }
        return solution;
    }
}
