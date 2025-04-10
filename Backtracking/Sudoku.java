public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // check the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // check the row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // check the 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;

    }



    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        // recursion
        int nextRow = row;      // row is same
        int nextCol = col + 1;   // column increments by 1

        // for next row and column
        if (col + 1 == 9) { // sudoku ke bahr jane pr next row pr jaega
            nextRow = row + 1;
            nextCol = 0;
        }


        if (sudoku[row][col] != 0) { // if sudoku is not zero we don't need to do the lower work we can dirctly call
                                     // next row and col
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        //for 1st row and column
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;       //if safe then place the digit  
                //for next row and column
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // sol exists
                }
                else{
                    sudoku[row][col] = 0; // if returned false we make it 0 instead of digit, so we can backtrack and make it correct
                }
                }

        }
        return false;
    }




    // to print the sudoku
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0, },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution does not exist");
        }

    }
}