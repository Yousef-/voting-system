package voting;

import java.util.ArrayList;
import java.util.Random;

public class Voting_controller{
	
	Voting_view			vv;
	Voting_model		vm;
	
	public Voting_controller()
	{
	}

	
Random rand = new Random();
	
	ArrayList<ArrayList<Integer>> voter = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> candidates = new ArrayList<Integer>();
	
	
	
	/**
	 * 
	 * @param voters
	 */
	public void setVoters(int voters)
	{
		
		final int cans = this.vm.getCandidates();
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

	public void setModel(Voting_model vm) {
		// TODO Auto-generated method stub
		
	}

	public void setView(Voting_view vv2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
