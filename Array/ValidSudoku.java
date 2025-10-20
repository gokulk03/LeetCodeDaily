package Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    

    public boolean isValidSudoku(char[][] board){
        Set sudokuSet = new HashSet();
        for(int row = 0;row<9;row++){
            for(int col = 0; col<9; col++){
                char num = board[row][col];
                if(num!='.'){
                    if(!sudokuSet.add(num + " in row: " + row) || (!sudokuSet.add(num + " in column: " + col)) || (!sudokuSet.add(num + "in block : "+row/3+"-"+col/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        
    }
}
