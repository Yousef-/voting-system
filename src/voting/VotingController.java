package voting;

import java.util.ArrayList;
import java.util.Random;

public class VotingController{
	
	VotingView		vv;
	VotingModel		vm;
	
	
	Random rand = new Random();
	
	ArrayList<ArrayList<Integer>> voter = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> candidates = new ArrayList<Integer>();
	
	
	public VotingController()
	{
	}
	
	
	
	
	/**
	 * 
	 * @param voters
	 */
	public void setVoters(int voters)
	{
		
		final int cans = this.vm.getNumberOfCandidates();
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
	
	public Object getResults() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVotersNumber(int votersNumber) {
		// TODO Auto-generated method stub
		
	}

	public void setModel(VotingModel vm) {
		// TODO Auto-generated method stub
		
	}

	public void setView(VotingView vv2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
