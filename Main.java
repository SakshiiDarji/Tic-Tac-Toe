import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Board b1 = new Board();

        b1.displayGameBoard();
        PlayerTurn p1 = new PlayerTurn();
        while (!p1.thereIsWinner) {

                p1.askPositionNumber();
             String player_X_pos = p1.getPositionNumber();

               // while (player_X_pos == "X" || player_X_pos =="O") {
                 //   System.out.println("Wrong input.");
                //    p1.askPositionNumber();
               //     player_X_pos = p1.getPositionNumber();
               // }

            p1.playerTurn(b1.gameBoard, player_X_pos , "player_X");
            b1.displayGameBoard();

            p1.checkWinner(b1.gameBoard);


            p1.askPositionNumber();
            String player_O_pos = p1.getPositionNumber();

        //    while (player_O_pos == "X" || player_O_pos =="O") {
         //       System.out.println("Wrong input.");
        //        p1.askPositionNumber();
           //     player_O_pos = p1.getPositionNumber();
         //   }
            p1.playerTurn(b1.gameBoard,player_O_pos, "player_O");
            b1.displayGameBoard();


            p1.checkWinner(b1.gameBoard);

        }
    }}

