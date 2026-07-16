class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return null;
        if (strs.size()==1 && strs.get(0).equals("")) return "";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i<strs.size(); i++)
        {
            answer.append(strs.get(i)+"/");
        }
        return answer.reverse().toString();
    }

    public List<String> decode(String str) {
        if (str==null) return new ArrayList<String>();
        if (str.equals(""))
        {
            List<String> answer = new ArrayList<String>();
            answer.add("");
            return answer;
        } 
        StringBuilder tor = new StringBuilder();
        tor.append(str);
        str = tor.reverse().toString();
        String[] splitted = str.split("/");
        List<String> answer = new ArrayList<String>();
        for (int i = 0; i<splitted.length; i++)
        {
            answer.add(splitted[i]);
        }
        return answer;
    }
}
