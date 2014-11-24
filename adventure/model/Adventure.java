package adventure.model;

import java.util.Random;

import adventure.controller.AdventureController;
import adventure.view.AdventurePanel;

public class Adventure
{
	private AdventureController baseController;
	private int successCount;
	public String goodStoryResult;
	public String badStoryResult;
	private int deathResult;
	private int successResult;
	public String optionOneStory;
	public String optionTwoStory;
	private AdventurePanel myInfo;
	public String deathStory;
	public String successStory;


	public Adventure(AdventureController baseController)
	{
		this.baseController = baseController;
		this.successCount = 0;
		
		myInfo = new AdventurePanel(baseController);
	}

	public AdventurePanel getMyInfo()
	{
		return myInfo;
	}

	public void setMyInfo(AdventurePanel myInfo)
	{
		this.myInfo = myInfo;
	}

	public int getSuccessCount()
	{
		return successCount;
	}

	public void setDeathResult(int randomChoice)
	{
		this.deathResult = randomChoice;
	}

	public int getDeathResult()
	{
		return deathResult;
	}

	public void setSuccessResult(int randomChoice)
	{
		this.successResult = randomChoice;
	}

	public int getSuccessResult()
	{
		return successResult;
	}
	

	public String goodStoryResult()
	{
		int randomChoice = (int) (Math.random() * 9);
		String result = successStory() + "\n \n" + baseController.StoryOptions[randomChoice];
		setDeathResult(randomChoice);
		setSuccessResult(randomChoice);
		myInfo.optionChoice = 1;
		successCount++;

		
		return result;
	}

	public String badStoryResult()
	{
		String result = "You lose! \n" + deathStory();
		successCount = 0;
		myInfo.optionChoice = 2;
		return result;
	}

	public String successStory()
	{
		String successStory = "";

		if (getSuccessResult() == 0 && myInfo.optionChoice() == 1)
		{
			successStory = "Your sword pierces it's heart! What luck!";
		}
		else if (getSuccessResult() == 0 && myInfo.optionChoice() == 2)
		{
			successStory = "The dragon believed you were dead! After a few uncomfortalbe sniffs, he left you alone.";
		}
		else if (getSuccessResult() == 1 && myInfo.optionChoice() == 1)
		{
			successStory = "The bandits are pleased with your tribute. You are allowed to continue after becoming an honory pirate.";
		}
		else if (getSuccessResult() == 1 && myInfo.optionChoice() == 2)
		{
			successStory = "Lucky for you, these pirates were only farmers pretending. They run away at the first sight of a brave enemy!";
		}
		else if (getSuccessResult() == 2 && myInfo.optionChoice() == 1)
		{
			successStory = "Amazingly, you slept off any affects of the poison! You continue on your way.";
		}
		else if (getSuccessResult() == 2 && myInfo.optionChoice() == 2)
		{
			successStory = "What you thought was more of the poisonous mushroom, turned out to be another kind that acts as an andidote!";
		}
		else if (getSuccessResult() == 3 && myInfo.optionChoice() == 1)
		{
			successStory = "You are barely out of reach! It rips off your shoe with its claws, but gets bored and goes away.";
		}
		else if (getSuccessResult() == 3 && myInfo.optionChoice() == 2)
		{
			successStory = "The bear was so suprised at your aggresiveness, he decides to leave you alone out of respect.";
		}
		else if (getSuccessResult() == 4 && myInfo.optionChoice() == 1)
		{
			successStory = "Well that was simple.";
		}
		else if (getSuccessResult() == 4 && myInfo.optionChoice() == 2)
		{
			successStory = "The river soon calms, and you are able to swim safely to shore to resume your adventure";
		}
		else if (getSuccessResult() == 5 && myInfo.optionChoice() == 1)
		{
			successStory = "You punched him so hard he died. The rest of the tribe worships you as one of their gods and let you pass.";
		}
		else if (getSuccessResult() == 5 && myInfo.optionChoice() == 2)
		{
			successStory = "You barely hid in time. They pass you by while sharpening their knives, oblivious to the dinner in the bushes.";
		}
		else if (getSuccessResult() == 6 && myInfo.optionChoice() == 1)
		{
			successStory = "While staring at it, you see it glint again. You realize it is a gun and quickly run for cover to escape.";
		}
		else if (getSuccessResult() == 6 && myInfo.optionChoice() == 2)
		{
			successStory = "You never found out what the glint was. Though you did hear a whishing sound while walking. How curious.";
		}
		else if (getSuccessResult() == 7 && myInfo.optionChoice() == 1)
		{
			successStory = "Good thing you ran when you did. The old guy with the cane looked particulary violent.";
		}
		else if (getSuccessResult() == 7 && myInfo.optionChoice() == 2)
		{
			successStory = "The townspeople leave you alone. Guess they just look naturally mean.";
		}
		else if (getSuccessResult() == 8 && myInfo.optionChoice() == 1)
		{
			successStory = "You get a beautiful girl to travel with! Sadly, she is out of your league and leaves you for another guy. You continue on your way.";
		}
		else if (getSuccessResult() == 8 && myInfo.optionChoice() == 2)
		{
			successStory = "Your wish was granted! But you can only fly 1 inch above the ground. Also, its really slow. You decide walking is best.";
		}
		else if (getSuccessResult() == 9 && myInfo.optionChoice() == 1)
		{
			successStory = "You barely escape! You can hear the bacon left in your tent sizzling with the heat. Yum.";
		}
		else if (getSuccessResult() == 9 && myInfo.optionChoice() == 2)
		{
			successStory = "By some miracle, the fire burns the fabric around you, and is put out by rain. You wake up in a bed of ashes only medium rare.";
		}

		return successStory;
	}

	public String deathStory()
	{
		String deathStory = "";

		if (getDeathResult() == 0 && myInfo.optionChoice() == 1)
		{
			deathStory = "The sword bounced off. He then blasted you with fire. Your bones will make for great toothpicks";
		}
		else if (getDeathResult() == 0 && myInfo.optionChoice() == 2)
		{
			deathStory = "You didn't fool him one bit. He took a leap into the air and landed on you. You make for a great pancake.";
		}
		else if (getDeathResult() == 1 && myInfo.optionChoice() == 1)
		{
			deathStory = "They noticed your gold was only the chocolate kind! You were stabbed while they ate your candy";
		}
		else if (getDeathResult() == 1 && myInfo.optionChoice() == 2)
		{
			deathStory = "You made it two feet before an arrow hit your face. Congratulations";
		}
		else if (getDeathResult() == 2 && myInfo.optionChoice() == 1)
		{
			deathStory = "You wake just in time to realize you are paralyzed and can't go for help. You die.";
		}
		else if (getDeathResult() == 2 && myInfo.optionChoice() == 2)
		{
			deathStory = "Eating more worked! At killing you better. You explode from too much poison.";
		}
		else if (getDeathResult() == 3 && myInfo.optionChoice() == 1)
		{
			deathStory = "That wasn't the tree silly! That was the bear!";
		}
		else if (getDeathResult() == 3 && myInfo.optionChoice() == 2)
		{
			deathStory = "You made the NFL proud. You moved him an inch before his claws knocked your head off!";
		}
		else if (getDeathResult() == 4 && myInfo.optionChoice() == 1)
		{
			deathStory = "By trying to walk out, you happened to walk into a deeper part full of jagged rocks. Should have kept floating.";
		}
		else if (getDeathResult() == 4 && myInfo.optionChoice() == 2)
		{
			deathStory = "You rode it out! All the way until you went off the waterfall.";
		}
		else if (getDeathResult() == 5 && myInfo.optionChoice() == 1)
		{
			deathStory = "The leader punched back. With a knife.";
		}
		else if (getDeathResult() == 5 && myInfo.optionChoice() == 2)
		{
			deathStory = "Unfortunately, you were too stealthy. They thought you were an animal in the brush and shot you for food.";
		}
		else if (getDeathResult() == 6 && myInfo.optionChoice() == 1)
		{
			deathStory = "While you were busy staring at it, you didn't notice the mountain lion right above you.";
		}
		else if (getDeathResult() == 6 && myInfo.optionChoice() == 2)
		{
			deathStory = "As fate would have it, that glint was the sun reflecting off of a gun. Too bad you didn't notice.";
		}
		else if (getDeathResult() == 7 && myInfo.optionChoice() == 1)
		{
			deathStory = "Though the town was friendly, their dogs were not. They took you running as a challenge. You made it 10 feet before the lead dog got to you.";
		}
		else if (getDeathResult() == 7 && myInfo.optionChoice() == 2)
		{
			deathStory = "Spitting on the ground is sacriligious. You were burned at the stake for hurting the enviroment with your nasty spittle.";
		}
		else if (getDeathResult() == 8 && myInfo.optionChoice() == 1)
		{
			deathStory = "That \"Girl\" you got turned out to be a female bear. Your travels together did not last long";
		}
		else if (getDeathResult() == 8 && myInfo.optionChoice() == 2)
		{
			deathStory = "How smart! You wished to be able to fly! Sadly, you did not specify how long that gift would last. ";
		}
		else if (getDeathResult() == 9 && myInfo.optionChoice() == 1)
		{
			deathStory = "Turns out, outside the front of your tent is where the fire started. Lots o' flames awaited.";
		}
		else if (getSuccessResult() == 9 && myInfo.optionChoice() == 2)
		{
			deathStory = "That was the best sleep of your life! It was so good, you never woke up.";
		}
		return deathStory;

	}

}
