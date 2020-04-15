import java.util.Scanner;

class Player
{
	// INSTANCE VARIABLES //

	private String name;
	private int wins;

	// STATIC VARIABLES //

	Scanner userInput = new Scanner(System.in);

	// CONTRUCTORS //

	Player()
	{
		setName(null);
		setWins(0);
	}

	Player(String name)
	{
		setName(name);
		setWins(0);
	}

	// ACCESSORS / MUTATORS //

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getWins()
	{
		return wins;
	}

	public void setWins(int wins)
	{
		this.wins = wins;
	}

	// METHODS //

	public void addWin()
	{
		wins++;
	}

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

	public void display()
	{
		System.out.printf("Name: %s, Wins: %d\n", name, wins);
	}
}
