// public class Nqueens {

//     public static boolean isSafe(char board[][], int row, int col) {

//         // koi bhi queen agr vertical,left diagonal, right diagonal pr hai tho false
//         // return krna hai

//         // vertical up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         // left diagonal up
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         // right diagonal up
//         for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void nqueens(char board[][], int row) { // here row is i
//         // base case
//         if (row == board.length) {
//             printBoard(board);
//             return;
//         }
//         // try to place queen in each column of current row
//         for (int j = 0; j < board.length; j++) {
//             if (isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nqueens(board, row + 1);
//                 board[row][j] = 'x';
//             }
//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("_______CHess Board________");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 board[i][j] = 'x';
//             }
//         }
//         nqueens(board, 0);

//     }
// }







//-------------->Print 1 sol if possible
public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col) {

        // koi bhi queen agr vertical,left diagonal, right diagonal pr hai tho false
        // return krna hai

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }



    public static boolean nqueens(char board[][], int row) { // here row is i
        // base case
        if (row == board.length) {
            return true;
        }
        
        // try to place queen in each column of current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nqueens(board, row + 1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }



    public static void printBoard(char board[][]) {
        System.out.println("_______CHess Board________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        if(nqueens(board, 0)){
            System.out.println("sol is possible");
            printBoard(board);
        }
        else{
            System.out.println("sol is not possible");
        }

    }
}
