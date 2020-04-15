class TicTacToe
{
    public static void main(String [] arg)
    {
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

        display(cellLetters);
    }




    public static void display(char [] cells)
    {
        System.out.printf(" %s | %s | %s \n", cells[0], cells[1], cells[2]);
        System.out.printf("-----------\n");
        System.out.printf(" %s | %s | %s \n", cells[3], cells[4], cells[5]);
        System.out.printf("-----------\n");
        System.out.printf(" %s | %s | %s \n", cells[6], cells[7], cells[8]);
    }
}
