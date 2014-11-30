package adventure.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import adventure.controller.AdventureController;
import adventure.model.Adventure;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class AdventurePanel extends JPanel
{
	private AdventureController baseController;
	private SpringLayout baseLayout;
	private JButton firstOptionButton;
	private JButton secondOptionButton;
	private JTextArea dialogueArea;
	private JScrollPane dialoguePane;
	private JLabel lblSuccesses;
	private JLabel lblTheAdventureGame;
	public int optionPick;

	public AdventurePanel(AdventureController baseController)
	{
		this.baseController = baseController;

		secondOptionButton = new JButton("Option 2");
		dialogueArea = new JTextArea("You decide to travel in the woods in search of a great treasure! On one fateful morning, your journey begins.... \n \n"
				+ "You come across a cave in the forest. A Dragon emerges to attack you. \n  Option 1: Throw your sword at it  \n  Option 2: Pretend to be dead");
		baseLayout = new SpringLayout();
		firstOptionButton = new JButton("Option 1");
		dialoguePane = new JScrollPane();
		dialogueArea.setBackground(Color.LIGHT_GRAY);
		optionPick = 0;

		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPane()
	{
		dialogueArea.setLineWrap(true);
		dialogueArea.setWrapStyleWord(true);
		dialogueArea.setEditable(false);
	}

	public void setSuccessCount(int successCount)
	{
		lblSuccesses.setText("Successes: " + successCount);
	}

	private void setupPanel()
	{
		this.add(dialogueArea);
		this.setBackground(new Color(0, 128, 0));
		this.setLayout(baseLayout);
		this.add(firstOptionButton);
		this.add(dialoguePane);
		this.add(secondOptionButton);

	}

	public int OptionCount()
	{
		int optionPicked = 0;
		if(optionPick == 1)
		{
			optionPicked = 1;
		}
		else if(optionPick == 2)
		{
			optionPicked = 2;		
		}
		return optionPicked;
	}

	private void setupLayout()
	{
		JLabel lblSuccesses = new JLabel("Successes: ");
		lblSuccesses.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lblTheAdventureGame = new JLabel("The Adventure Game!");
		lblTheAdventureGame.setFont(new Font("Tahoma", Font.PLAIN, 18));
		baseLayout.putConstraint(SpringLayout.SOUTH, dialogueArea, -6, SpringLayout.NORTH, firstOptionButton);
		baseLayout.putConstraint(SpringLayout.NORTH, firstOptionButton, 239, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstOptionButton, 56, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstOptionButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstOptionButton, -254, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, lblTheAdventureGame, 40, SpringLayout.EAST, lblSuccesses);
		baseLayout.putConstraint(SpringLayout.NORTH, lblSuccesses, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, lblSuccesses, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblSuccesses, 44, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblSuccesses, 111, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dialogueArea, 18, SpringLayout.SOUTH, lblTheAdventureGame);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblTheAdventureGame, -245, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lblTheAdventureGame, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblTheAdventureGame, -123, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, dialogueArea, 44, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, dialogueArea, -31, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondOptionButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, secondOptionButton, -58, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondOptionButton, 252, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondOptionButton, 239, SpringLayout.NORTH, this);
		add(lblSuccesses);
		add(lblTheAdventureGame);
	}

	private void setupListeners()
	{
		firstOptionButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				dialogueArea.setText(baseController.getStoryResult());
				optionPick = 1;
				OptionCount();
			}

		});

		secondOptionButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent click)
			{
				dialogueArea.setText(baseController.getStoryResult());
				optionPick = 2;
			}

		});

	}

}
