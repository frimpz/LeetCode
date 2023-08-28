import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

class ValidSudoku {
    public ValidSudoku() {}



    public boolean isValidSudoku(char[][] board) {


        HashMap<Integer, HashSet<Character>> rowset = new HashMap<Integer, HashSet<Character>>();

        HashMap<Integer, HashSet<Character>> midset = new HashMap<Integer, HashSet<Character>>();

        for(int row=0; row< board.length; row++){

            HashSet<Character> colset = new HashSet<>();
            for(int col=0; col<board.length; col++){

                if(board[row][col] == '.'){
                    continue;
                }

                if(colset.contains(board[row][col])){
                    return false;
                }
                else{
                    colset.add(board[row][col]);
                }


                if(rowset.containsKey(col)) {
                    if (rowset.get(col).contains(board[row][col])) {
                        return false;
                    } else {
                        rowset.get(col).add(board[row][col]);
                    }
                }else{
                    rowset.put(col, new HashSet<>());
                    rowset.get(col).add(board[row][col]);
                }

                /// last section

                int _key = 3 * (row/3) + col/3;

                if(midset.containsKey(_key)){
                    if (midset.get(_key).contains(board[row][col])) {
                        return false;
                    } else {
                        midset.get(_key).add(board[row][col]);
                    }
                }
                else {
                    midset.put(_key, new HashSet<>());
                    midset.get(_key).add(board[row][col]);
                }

            }

        }



        return true;

    }

    public static void main(String[] args) {

        ValidSudoku ga = new ValidSudoku();
        boolean out = ga.isValidSudoku(new char[][]{{'8','3','.','.','7','.','.','.','.'},
                                                {'6','.','.','1','9','5','.','.','.'},
                                                {'.','9','8','.','.','.','.','6','.'},
                                                {'8','.','.','.','6','.','.','.','3'},
                                                {'4','.','.','8','.','3','.','.','1'},
                                                {'7','.','.','.','2','.','.','.','6'},
                                                {'.','6','.','.','.','.','2','8','.'},
                                                {'.','.','.','4','1','9','.','.','5'},
                                                {'.','.','.','.','8','.','.','7','9'}});
        System.out.println(out);
    }
}