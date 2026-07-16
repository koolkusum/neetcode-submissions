class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-2; i++)
        {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = nums[i]*-1;
            int left = i+1;
            int right =  nums.length-1;
            while(left<right)
            {
                if (nums[left]+nums[right]==target)
                {
                  ArrayList<Integer> added = new ArrayList<>();  
                  added.add(nums[i]);
                  added.add(nums[left]);
                  added.add(nums[right]);
                  result.add(added);
                  left++;
                  right--;
                  while(left<right && nums[left]==nums[left-1])
                  {
                     left++;
                  }

                }
                else if(nums[left]+nums[right]>target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return result;
    }
}
