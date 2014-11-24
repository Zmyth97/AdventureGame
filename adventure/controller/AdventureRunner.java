package adventure.controller;

/**
 * The Runner for the Game
 * @author Zack Moss
 * @version 1.1
 */
public class AdventureRunner
{
	public static void main(String [] args)
	{
		AdventureController baseController = new AdventureController();
		baseController.start();
	}
}
