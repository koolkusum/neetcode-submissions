class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==1)
        {
            List<List<String>> result = new ArrayList<>();
            List<String> inner = new ArrayList<>();
            inner.add(strs[0]);
            result.add(inner);
            return result; 
        }
        //make a HashMap with aphabetized string
        HashMap<String, List<String>>map = new HashMap<String, List<String>>();
        for (String str : strs)
        {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            if (!map.containsKey(new String(sorted))) map.put(new String(sorted), new ArrayList<String>());
            map.get(new String(sorted)).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
