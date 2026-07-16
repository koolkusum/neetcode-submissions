class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i<nums.length; i++)
        {
            if (i ==0 ) answer[i] = 1;
            else answer[i] = nums[i-1] * answer[i-1];
        }
        int post = 1;
        for (int i = nums.length-1; i>=0; i--)
        {
            answer[i]= post*answer[i];
            post = post* nums[i];
        }
        return answer;
    }
}  
