import java.util.Scanner;

class TicTacToe
{
    public static void main(String [] arg)
    {
        // NOTE - 0 = no win, 1 = X win, 2 = O win, 3 = tie

        int gameStatus;
        boolean gameEnd = false;
        int playerOneMove;
        int playerTwoMove;
        boolean playerOneTurn = true;
        boolean playerTwoTurn = false;
        String player1Name = null;
        String player2Name = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1 please enter your name:");
        player1Name = input.next();
        System.out.println("Player 2 please enter your name:");
        player2Name = input.next();

        Player playerOne = new Player(player1Name);
        Player playerTwo = new Player(player2Name);

        char [] cellLetters = new char[9];

        for(int i = 0; i < 9; i++)
        {
            cellLetters[i] = (char)(i + 49);
        }

        display(cellLetters);

        while (gameEnd == false)
        {
            if (playerOneTurn == true)
            {
                playerOneMove = playerOne.nextMove();

                if (openCheck(cellLetters[playerOneMove - 1]))
                {
                    cellLetters[playerOneMove - 1] = 'X';
                    display(cellLetters);
                    playerOneTurn = false;
                    playerTwoTurn = true;
                }
                else
                {
                    System.out.println("The selected cell is taken. Please enter a different cell.");
                    display(cellLetters);
                    playerOneTurn = true;
                    playerTwoTurn = false;
                }
            }

            gameStatus = winCheck(cellLetters);


            switch (gameStatus)
            {
                case 0:
                //DO NOTHING
                break;

                case 1:
                System.out.printf("%s wins!\n", playerOne.getName());
                gameEnd = true;
                break;

                case 2:
                System.out.printf("%s wins!\n", playerTwo.getName());
                gameEnd = true;
                break;

                case 3:
                System.out.println("Tie!");
                gameEnd = true;
                break;
            }

            if (gameEnd == false)
            {
                if (playerTwoTurn == true)
                {
                    playerTwoMove = playerTwo.nextMove();

                    if (openCheck(cellLetters[playerTwoMove - 1]))
                    {
                        cellLetters[playerTwoMove - 1] = 'O';
                        display(cellLetters);
                        playerTwoTurn = false;
                        playerOneTurn = true;
                    }
                    else
                    {
                        System.out.println("The selected cell is taken. Please enter a different cell.");
                        display(cellLetters);
                        playerTwoTurn = true;
                        playerOneTurn = false;
                    }
                }

                gameStatus = winCheck(cellLetters);

                switch (gameStatus)
                {
                    case 0:
                    //DO NOTHING
                    break;

                    case 1:
                    System.out.printf("%s wins!\n", playerOne.getName());
                    gameEnd = true;
                    break;

                    case 2:
                    System.out.printf("%s wins!\n", playerTwo.getName());
                    gameEnd = true;
                    break;

                    case 3:
                    System.out.println("Tie!");
                    gameEnd = true;
                    break;
                }
            }
        }
    }

    public static void display(char [] cells)
    {
        System.out.printf(" %s | %s | %s \n", cells[0], cells[1], cells[2]);
        System.out.printf("-----------\n");
        System.out.printf(" %s | %s | %s \n", cells[3], cells[4], cells[5]);
        System.out.printf("-----------\n");
        System.out.printf(" %s | %s | %s \n", cells[6], cells[7], cells[8]);
    }

    public static int winCheck(char [] cells)
    {
        if (cells[0] == 'X' && cells[1] == 'X' && cells[2] == 'X')
        {
            return 1;
        }
        else if (cells[2] == 'X' && cells[5] == 'X' && cells[8] == 'X')
        {
            return 1;
        }
        else if (cells[6] == 'X' && cells[7] == 'X' && cells[8] == 'X')
        {
            return 1;
        }
        else if (cells[0] == 'X' && cells[3] == 'X' && cells[6] == 'X')
        {
            return 1;
        }
        else if (cells[0] == 'X' && cells[4] == 'X' && cells[8] == 'X')
        {
            return 1;
        }
        else if (cells[2] == 'X' && cells[4] == 'X' && cells[6] == 'X')
        {
            return 1;
        }
        else if (cells[1] == 'X' && cells[4] == 'X' && cells[7] == 'X')
        {
            return 1;
        }
        else if (cells[3] == 'X' && cells[4] == 'X' && cells[5] == 'X')
        {
            return 1;
        }
        if (cells[0] == 'O' && cells[1] == 'O' && cells[2] == 'O')
        {
            return 2;
        }
        else if (cells[2] == 'O' && cells[5] == 'O' && cells[8] == 'O')
        {
            return 2;
        }
        else if (cells[6] == 'O' && cells[7] == 'O' && cells[8] == 'O')
        {
            return 2;
        }
        else if (cells[0] == 'O' && cells[3] == 'O' && cells[6] == 'O')
        {
            return 2;
        }
        else if (cells[0] == 'O' && cells[4] == 'O' && cells[8] == 'O')
        {
            return 2;
        }
        else if (cells[2] == 'O' && cells[4] == 'O' && cells[6] == 'O')
        {
            return 2;
        }
        else if (cells[1] == 'O' && cells[4] == 'O' && cells[7] == 'O')
        {
            return 2;
        }
        else if (cells[3] == 'O' && cells[4] == 'O' && cells[5] == 'O')
        {
            return 2;
        }
        else if (cells[0] != '1' && cells[1] != '2' && cells[2] != '3' && cells[2] != '4' && cells[3] != '4' && cells[4] != '5' && cells[5] != '6' && cells[6] != '7' && cells[7] != '8' && cells[8] != '9')
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }

    public static boolean openCheck(char cellContent)
    {
        if (cellContent != 'X' && cellContent != 'O')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
