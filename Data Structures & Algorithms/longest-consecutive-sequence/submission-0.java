class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> unique = new HashMap<Integer,Integer>();
        for (int num:nums)
        {
            unique.put(num,0);
        }
        int longest = 0;
        int result = 0;
        for (int num: unique.keySet())
        {

            if (!unique.containsKey(num-1))
            {
                int iterator = 0;
                while(unique.containsKey(num+iterator))
                {
                    result++;
                    iterator++;
                }
            }
            longest = Math.max(result,longest);
            result = 0;
        }
        return longest;
        
    }

}
