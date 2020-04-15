class Player
{
	// VARIABLES //

	private String name;
	private int wins;

	// CONTRUCTOR //

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

	public void display()
	{
		System.out.printf("Name: %s, Wins: %d\n", name, wins);
	}
}
