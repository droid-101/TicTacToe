class TicTacToe
{
    public static void main(String [] arg)
    {
        // NOTE - 0 = no win, 1 = X win, 2 = O win, 3 = tie

        int movesMade = 0;
        int gameStatus;

        char [] cellLetters = new char[9];
        cellLetters[0] = ' ';
        cellLetters[1] = ' ';
        cellLetters[2] = ' ';
        cellLetters[3] = ' ';
        cellLetters[4] = ' ';
        cellLetters[5] = ' ';
        cellLetters[6] = ' ';
        cellLetters[7] = ' ';
        cellLetters[8] = ' ';

        gameStatus = winCheck(cellLetters, movesMade);
        display(cellLetters);

        movesMade++;

        switch (gameStatus)
        {
            case 0:
            //DO NOTHING
            break;

            case 1:
            System.out.println("Player 1 wins!");
            break;

            case 2:
            System.out.println("Player 2 wins!");
            break;

            case 3:
            System.out.println("Tie!");
            break;
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

    public static int winCheck(char [] cells, int moves)
    {
        if (cells[0] == 'X' && cells[1] == 'X' && cells[2] == 'X')
        {
            return 1;
        }
        else
        {
            if (cells[2] == 'X' && cells[5] == 'X' && cells[8] == 'X')
            {
                return 1;
            }
            else
            {
                if (cells[6] == 'X' && cells[7] == 'X' && cells[8] == 'X')
                {
                    return 1;
                }
                else
                {
                    if (cells[0] == 'X' && cells[3] == 'X' && cells[6] == 'X')
                    {
                        return 1;
                    }
                    else
                    {
                        if (cells[0] == 'X' && cells[4] == 'X' && cells[8] == 'X')
                        {
                            return 1;
                        }
                        else
                        {
                            if (cells[2] == 'X' && cells[4] == 'X' && cells[6] == 'X')
                            {
                                return 1;
                            }
                            else
                            {
                                if (cells[1] == 'X' && cells[4] == 'X' && cells [7] == 'X')
                                {
                                    return 1;
                                }
                                else
                                {
                                    if (cells[3] == 'X' && cells[4] == 'X' && cells[5] == 'X')
                                    {
                                        return 1;
                                    }
                                    else
                                    {
                                        if (cells[0] == 'O' && cells[1] == 'O' && cells[2] == 'O')
                                        {
                                            return 2;
                                        }
                                        else
                                        {
                                            if (cells[2] == 'O' && cells[5] == 'O' && cells[8] == 'O')
                                            {
                                                return 2;
                                            }
                                            else
                                            {
                                                if (cells[6] == 'O' && cells[7] == 'O' && cells[8] == 'O')
                                                {
                                                    return 2;
                                                }
                                                else
                                                {
                                                    if (cells[0] == 'O' && cells[3] == 'O' && cells[6] == 'O')
                                                    {
                                                        return 2;
                                                    }
                                                    else
                                                    {
                                                        if (cells[0] == 'O' && cells[4] == 'O' && cells[8] == 'O')
                                                        {
                                                            return 2;
                                                        }
                                                        else
                                                        {
                                                            if (cells[2] == 'O' && cells[4] == 'O' && cells[6] == 'O')
                                                            {
                                                                return 2;
                                                            }
                                                            else
                                                            {
                                                                if (cells[1] == 'O' && cells[4] == 'O' && cells [7] == 'O')
                                                                {
                                                                    return 2;
                                                                }
                                                                else
                                                                {
                                                                    if (cells[3] == 'O' && cells[4] == 'O' && cells[5] == 'O')
                                                                    {
                                                                        return 2;
                                                                    }
                                                                    else
                                                                    {
                                                                        if (moves == 9)
                                                                        {
                                                                            return 3;
                                                                        }
                                                                        else
                                                                        {
                                                                            return 0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
