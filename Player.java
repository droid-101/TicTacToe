class Player
{
	// VARIABLES //

	private String name;
	private int wins;

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

	public void display()
	{
		System.out.printf("Name: %s, Wins: %d\n", name, wins);
	}
}
