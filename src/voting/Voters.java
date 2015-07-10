package voting;

import java.util.*;

public class Voters extends Voting_model{
	Random rand = new Random();
	
	ArrayList<ArrayList<Integer>> voter = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> candidates = new ArrayList<Integer>();
	
	
	
	
	public Voters(int voters)
	{
		setVoters(voters);
	}
	
	/**
	 * 
	 * @param voters
	 */
	public void setVoters(int voters)
	{
		
		final int cans = this.getCandidates();
		boolean loop = true;
		int temp = 0;
		
		candidates.clear();
		for(int i=0; i<voters;i++)
		{
			while(loop)
			{
				temp = rand.nextInt(cans+1);
				
				if(!this.candidates.contains(temp))
					this.candidates.add(temp);
				
				if(this.candidates.size() == cans)
					loop = false;
			}
			this.voter.get(i).addAll(candidates);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> getVoters()
	{
		return this.voter;
	}
}
