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
	 * 
	 * @return
	 */
	private int votersNumber()
	{
		JFrame frame = new JFrame("Input");
		String vs = JOptionPane.showInputDialog(frame, "set the number of voters");
		return Integer.parseInt(vs);
	}

	/**
	 * 
	 * @param vm2
	 */
	public void setModel(VotingModel vm2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
