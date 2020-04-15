class Player
{
	// VARIABLES //

	String name;
	int wins;

	// CONTRUCTOR //

	Player(String name)
	{
		this.name = name;
		this.wins = 0;
	}

	// METHODS //

	void display()
	{
		System.out.printf("Name: %s, Wins: %d\n", name, wins);
	}
}
