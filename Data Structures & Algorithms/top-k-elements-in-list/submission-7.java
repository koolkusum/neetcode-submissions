class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
        for (int num : nums)
        {
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num)+1);
        }
        ArrayList<Integer> [] freq = new ArrayList[nums.length+1];
        for (int i = 0; i< freq.length; i++)
        {
            freq[i] = new ArrayList<Integer>();
        }
        
        int maxIndex = 0;
        for (int key:map.keySet())
        {
            int repeat = map.get(key);
            freq[repeat].add(key);
            if (repeat> maxIndex) maxIndex=repeat;
        }
        
        int[] answer = new int[k];
        int index = 0;
        for (int i = maxIndex; i > 0 && index < k; i--) {
            for (int j = 0; j < freq[i].size() && index < k; j++) {
                answer[index++] = freq[i].get(j);
            }
        }
        return answer;
    }
}
