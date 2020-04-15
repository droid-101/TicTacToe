class PlayerTest
{
	public static void main(String [] args)
	{
		Player player = new Player("Bob");
		player.display();

		System.out.println(player.getName());
		player.setName("Alice");
		System.out.println(player.getName());

		System.out.println(player.getWins());
		player.setWins(3);
		System.out.println(player.getWins());

		player.display();
	}
}
