import java.util.Scanner;

public class PlayerTurn {

   private String position;

   private char symbol;

  public boolean thereIsWinner = false;
    Scanner scanner = new Scanner(System.in);

    public void playerTurn(char[][] gameboard, String position, String typePlayer) {



        if(typePlayer == "player_X") {
            setSymbol('X');
        }
        else          //for player_O
        {
            setSymbol('O');
        }

        switch (position) {
            case "1" :
                gameboard[0][0] = symbol;
               // setPosition(Character.toString(symbol));
                break;

            case "2" :
                gameboard[0][2] = symbol;
                //setPosition(Character.toString(symbol));
                break;

            case "3" :
                gameboard[0][4] = symbol;
               // setPosition(Character.toString(symbol));
                break;

            case "4" :
                gameboard[2][0] = symbol;
               // setPosition(Character.toString(symbol));
                break;
            case "5" :
                gameboard[2][2] = symbol;
               // setPosition(Character.toString(symbol));
                break;

            case "6" :
                gameboard[2][4] = symbol;
               // setPosition(Character.toString(symbol));
                break;
            case "7" :
                gameboard[4][0] = symbol;
               // setPosition(Character.toString(symbol));
                break;

            case "8" :
                gameboard[4][2] = symbol;
               // setPosition(Character.toString(symbol));
                break;

            case "9" :
                gameboard[4][4] = symbol;
              //  setPosition(Character.toString(symbol));
                break;

            default:
                System.out.println(" : ");

        }

    }


    public String getPositionNumber() {
        return this.position;
    }

    public void setPosition(String pos) {
        this.position = pos;
    }

    public void askPositionNumber() {                      //setting the position number
        System.out.println("Where would you like to play? (1-9) : ");
        this.position = scanner.nextLine();
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char Symbol) {
        this.symbol = Symbol;
    }

public void checkWinner(char[][] gameboard) {



        if ((gameboard[0][0] == getSymbol() && gameboard[0][2] == getSymbol() && gameboard[0][4] == getSymbol()) ||
                (gameboard[2][0] == getSymbol() && gameboard[2][2] == getSymbol() && gameboard[2][4] == getSymbol()) ||
                (gameboard[4][0] == getSymbol() && gameboard[4][2] == getSymbol() && gameboard[4][4] == getSymbol()) ||


                (gameboard[0][0] == getSymbol() && gameboard[2][0] == getSymbol() && gameboard[4][0] == getSymbol()) ||
                (gameboard[0][2] == getSymbol() && gameboard[2][2] == getSymbol() && gameboard[4][2] == getSymbol()) ||
                (gameboard[0][4] == getSymbol() && gameboard[2][4] == getSymbol() && gameboard[4][4] == getSymbol()) ||

                (gameboard[0][0] == getSymbol() && gameboard[2][2] == getSymbol() && gameboard[4][4] == getSymbol()) ||
                (gameboard[4][0] == getSymbol() && gameboard[2][2] == getSymbol() && gameboard[0][4] == getSymbol())
        ) {
            System.out.println("Congratulations, " + getSymbol() + " wins." );
            this.thereIsWinner = true;

        }


}




}
