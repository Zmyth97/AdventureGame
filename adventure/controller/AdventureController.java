package adventure.controller;

import adventure.model.Adventure;
import adventure.view.AdventureFrame;
import adventure.view.AdventurePanel;
import adventure.view.AdventureView;

public class AdventureController
{
	private AdventureFrame appFrame;
	private Adventure myAdventure;
	public static String[] StoryOptions;

	public AdventureController()
	{
		appFrame = new AdventureFrame(this);
		buildStoryOptionsArray();
		myAdventure = new Adventure(null);
	}

	/**
	 * Main part of program, runs app.
	 */

	public void start()
	{
		
	}
	

	public String getStoryResult()
	{
		String result = "";
		int randomResult = (int) (Math.random() * 2);

		if (randomResult == 0)
		{
			result = myAdventure.goodStoryResult();
		}
		else if (randomResult == 1)
		{
			result = myAdventure.badStoryResult();
		}

		return result;

	}

	private void buildStoryOptionsArray()
	{
		StoryOptions = new String[10];
		StoryOptions[0] = "You come across a cave in the forest. A Dragon emerges to attack you. \n  Option 1: Throw your sword at it  \n  Option 2: Pretend to be dead";
		StoryOptions[1] = "While Traveling, you get ambushed by bandits. \n Option 1: Bribe them with gold \n Option 2: Attack them head on";
		StoryOptions[2] = "You get hungry and decide to eat a mushroom. It was poisonous. \n Option 1: Try to sleep it off. \n Option 2: Try to eat another mushroom in hopes it will help";
		StoryOptions[3] = "A bear jumps out of the thicket! \n Option 1: Climb a tree. \n Option 2: Tackle it";
		StoryOptions[4] = "You fall into a fast moving river. \n Option 1: Stand up and walk out. \n Option 2: Grab a branch and ride it out";
		StoryOptions[5] = "Indians find you along the trail and approach. \n Option 1: Punch the leader in the face to show your superiority. \n Option 2: Hide in the bushes";
		StoryOptions[6] = "You see a curious glint on the mountian above you \n Option 1: Stop and stare at it. \n Option 2: Continue on your way";
		StoryOptions[7] = "You reach a town. The townspeople seem shifty and keep looking at you. \n Option 1: Leave town running. \n Option 2: Spit on the ground and continue into town";
		StoryOptions[8] = "A magical troll crawls out from the bridge you are on and offers you a wish. \n Option 1: Wish for a girl to travel with. \n Option 2: Wish to be able to fly";
		StoryOptions[9] = "You wake up to find your tent is on fire. \n Option 1: Run out the front of it. \n Option 2: Go back to sleep, it doesn't matter.";
	}

}
