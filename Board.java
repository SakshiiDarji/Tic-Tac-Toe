public class Board {

    char [] [] gameBoard = { {'1', '|', '2', '|', '3' },
            {'-', '+', '-', '+', '-' },
            {'4', '|', '5', '|', '6' },
            {'-', '+', '-', '+', '-' },
            {'7', '|', '8', '|', '9' }};

    public void displayGameBoard() {
        for(char[] row: gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
