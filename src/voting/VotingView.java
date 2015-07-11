package voting;

import javax.swing.*;

public class VotingView{
	VotingModel vm;
	
	JFrame results = new JFrame("results");
	
	DefaultListModel list = new DefaultListModel();
	
	/**
	 * 
	 */
	public VotingView()
	{
		setUpGUI();
	}
	
	/**
	 * 
	 */
	private void setUpGUI()
	{
		//JOptionPane.showMessageDialog(results,);
	}
	
	/**
	 * @return 
	 */
	public int votersNumber()
	{
		int i = 0;
		JFrame frame = new JFrame("Input");
		String vs = JOptionPane.showInputDialog(frame, "set the number of voters");
		try{
			i = Integer.parseInt(vs);
		}catch (NumberFormatException e)
		{
			votersNumber();
		}
		if(i == 0)
		{
			votersNumber();
		}
		return i;
	}

	/**
	 * 
	 * @param vm2
	 */
	public void setModel(VotingModel vm2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
