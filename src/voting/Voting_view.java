package voting;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class Voting_view{
	
	JFrame results = new JFrame("results");
	
	DefaultListModel list = new DefaultListModel();
	
	public Voting_view(Voting_controller vc)
	{
		setUpGUI(vc);
	}
	
	private void setUpGUI(Voting_controller vc)
	{
		JOptionPane.showMessageDialog(results, vc.getResults());
	}
	
	public int votersNumber()
	{
		JFrame frame = new JFrame("Input");
		String vs = JOptionPane.showInputDialog(frame, "set the number of voters");
		return Integer.parseInt(vs);
	}
	
	
}
