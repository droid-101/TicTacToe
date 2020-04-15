import java.util.Scanner;

/* =================================================
 * @Author: Kyle Pinto
 * @Date: Tuesday, April 14, 2020.
 *
 * This class represents a Tic Tac Toe player.
 * It stores data about the player's name and the
 * number of Tic Tac Toe games that they have won.
 * It can also prompt them to enter their next move.
 * ================================================= */

class Player
{
	// INSTANCE VARIABLES //

	private String name;
	private int wins;

	// STATIC VARIABLES //

	Scanner userInput = new Scanner(System.in);

	// CONTRUCTORS //

	/* -------------------------------------------------
	 * This is the default constructor.  It will initialize
	 * the player name to 'null' and their wins to 0.
	 *
	 * @param:   none (void)
	 * @return:  player (Player)
	 * ------------------------------------------------- */

	Player()
	{
		setName(null);
		setWins(0);
	}

	/* -------------------------------------------------
	 * This constructor creates a player with a specific
	 * name, specified as an argument.
	 *
	 * @param:   name (String)
	 * @return:  player (Player)
	 * ------------------------------------------------- */

	Player(String name)
	{
		setName(name);
		setWins(0);
	}

	// ACCESSORS / MUTATORS //

	/* -------------------------------------------------
	 * Returns the player's name
	 *
	 * @param:   none (void)
	 * @return:  name (String)
	 * ------------------------------------------------- */

	public String getName()
	{
		return name;
	}

	/* -------------------------------------------------
	 * Sets the player's name
	 *
	 * @param:   name (String)
	 * @return:  none (void)
	 * ------------------------------------------------- */

	public void setName(String name)
	{
		this.name = name;
	}

	/* -------------------------------------------------
	 * Returns the player's wins
	 *
	 * @param:   none (void)
	 * @return:  wins (int)
	 * ------------------------------------------------- */

	public int getWins()
	{
		return wins;
	}

	/* -------------------------------------------------
	 * Sets the player's wins
	 *
	 * @param:   wins (int)
	 * @return:  none (void)
	 * ------------------------------------------------- */

	public void setWins(int wins)
	{
		this.wins = wins;
	}

	// METHODS //

	/* -------------------------------------------------
	 * Increments the player's wins by 1
	 *
	 * @param:   none (void)
	 * @return:  none (void)
	 * ------------------------------------------------- */

	public void addWin()
	{
		wins++;
	}

	/* -------------------------------------------------
	 * Asks the player to enter the square number for
	 * their next move.  The square number must be in
	 * between 1 and 9 inclusively.  Any other input
	 * format is rejected. In the case of invalid inputs,
	 * the user will be re-prompted.
	 *
	 * @param:   none (void)
	 * @return:  square (int)
	 * ------------------------------------------------- */

	public int nextMove()
	{
		int square = 0;
		String input = null;

		do
		{
			System.out.printf("%s: select a square (1-9) for your next move: ", name);
			input = userInput.nextLine();

			if (input.length() == 0)
			{
				System.out.println("ERROR: No input provided");
				continue;
			}

			try
			{
				square = Integer.parseInt(input);
			}
			catch (NumberFormatException exeption)
			{
				System.out.println("ERROR: Input is not an integer");
				continue;
			}

			if (square < 1 || square > 9)
			{
				System.out.println("ERROR: Input is not between 1 and 9");
			}
		}
		while (square < 1 || square > 9);

		return square;
	}

	/* -------------------------------------------------
	 * Displays the player's name and wins
	 *
	 * @param:   none (void)
	 * @return:  none (void)
	 * ------------------------------------------------- */

	public void display()
	{
		System.out.printf("Name: %s, Wins: %d\n", name, wins);
	}
}
