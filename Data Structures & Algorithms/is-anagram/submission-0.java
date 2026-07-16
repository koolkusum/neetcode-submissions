class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character, Integer> wordOne = new HashMap<Character, Integer>();
        HashMap<Character, Integer> wordTwo = new HashMap<Character,Integer>();
        for (char curr : s.toCharArray())
        {
            if (wordOne.containsKey(curr)) wordOne.put(curr, wordOne.get(curr)+1);
            else wordOne.put(curr, 1);
        }

        for (char curr : t.toCharArray())
        {
            if (wordTwo.containsKey(curr)) wordTwo.put(curr, wordTwo.get(curr)+1);
            else wordTwo.put(curr, 1);
        }
        return wordOne.equals(wordTwo);

    }
}
