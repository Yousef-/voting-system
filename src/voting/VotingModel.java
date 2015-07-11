package voting;

import java.util.ArrayList;

public class VotingModel {
	
	
	ArrayList<String> candidate = new ArrayList<String>();
	
	
	/**
	 * the model contains all the candidates for the vote<br>
	 */
	public VotingModel()
	{
		this.candidate = new ArrayList<String>();
		setCans();
	}
	
	
	/**
	 * 
	 * @param can	the candidate name<br>
	 */
	public void addCans(String can)
	{
		this.candidate.add(can);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getCandidates()
	{
		return this.candidate;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumberOfCandidates()
	{
		return this.candidate.size();
	}
	
	/**
	 * 
	 */
	private void setCans()
	{
		this.candidate.add("jon");
		this.candidate.add("mark");
		this.candidate.add("david");
		this.candidate.add("joseph");
		this.candidate.add("stewart");
	}

}
