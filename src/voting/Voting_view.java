package voting;

import javax.swing.*;

public class Voting_view{
	Voting_model vm;
	
	JFrame results = new JFrame("results");
	
	DefaultListModel list = new DefaultListModel();
	
	/**
	 * 
	 */
	public Voting_view()
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
	public void setModel(Voting_model vm2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
