package adventure.view;

import javax.swing.JFrame;
import adventure.controller.AdventureController;

public class AdventureFrame extends JFrame
{
	private AdventurePanel basePanel;
	
	public AdventureFrame(AdventureController baseController) 
	{
		basePanel = new AdventurePanel(baseController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
			this.setContentPane(basePanel);
			this.setSize(500, 300);
			this.setResizable(false);
			setVisible(true);
	}
}
