class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> solution = new ArrayList<>();
     HashMap<String, ArrayList<String>> temp = new HashMap<>();;
     for (int i = 0; i<strs.length; i++)
     {
        String word = strs[i];
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (!temp.containsKey(sorted))
        {
            ArrayList<String> words = new ArrayList<String>();
            words.add(word);
            temp.put(sorted, words);
        }
        else {
            temp.get(sorted).add(word);
        }

     }
        for (ArrayList<String> group : temp.values()) {
            solution.add(group);
        }

        return solution;

    }
}