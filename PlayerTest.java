/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * @Author: Kyle Pinto
 * @Date: Tuesday, April 14, 2020.
 *
 * This program tests the features of the Player class.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

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

		Player player2 = new Player();
		player2.display();
		player2.addWin();
		player2.display();

		System.out.println(player.nextMove());
	}
}
