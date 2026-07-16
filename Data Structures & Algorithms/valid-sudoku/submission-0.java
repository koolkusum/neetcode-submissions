class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, ArrayList<Integer>> rows = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> cols = new HashMap<>();
        for (int i = 0; i<board.length; i++)
        {
            for (int j =0; j<board[0].length; j++)
            {
                char cell = board[i][j];
                if (cell=='.') continue;
                else
                {
                    if(rows.containsKey(cell))
                    {
                        ArrayList<Integer> numrows = rows.get(cell);
                        if(numrows.contains(i)) return false;
                        numrows.add(i);
                        rows.put(cell, numrows);
                    }
                    else
                    {
                        ArrayList<Integer> numrows = new ArrayList<>();
                        numrows.add(i);
                        rows.put(cell, numrows);
                    }
                    if(cols.containsKey(cell))
                    {
                        ArrayList<Integer> numcols = cols.get(cell);
                        if(numcols.contains(j)) return false;
                        numcols.add(j);
                        cols.put(cell, numcols);
                    }
                    else
                    {
                        ArrayList<Integer> numcols = new ArrayList<>();
                        numcols.add(j);
                        cols.put(cell, numcols);
                    }
                }
            }
        }
        for (int i= 0; i<board.length; i=i+3)
        {
            for (int j = 0; j<board[0].length;j=j+3)
            {
                ArrayList<Character> square = new ArrayList<>();
                for (int k = 0; k<3; k++)
                {
                    for (int l = 0; l<3; l++)
                    {
                        if (board[i+k][j+l]=='.')continue;
                        if(square.contains(board[i+k][j+l])) return false;
                        square.add(board[i+k][j+l]);
                    }
                }
            }
        }

        return true;
        
    }
}
