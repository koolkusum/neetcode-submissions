class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = left+1;
        int sum =0;
        while (left < numbers.length - 1) {
            sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; 
            } else if (sum < target) {
                right++;
                if (right >= numbers.length) {
                    left++;
                    right = left + 1;
                }
            } else {
                left++;
                right = left + 1;
            }
        }

        return new int[]{-1, -1}; 
    }
}
