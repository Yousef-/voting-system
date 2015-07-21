package voting;

import java.util.*;

public class Driver {
	
	int candidates = 0;
	int voters = 0;
	int votes = 0;
	
	ArrayList<ArrayList<Integer>> votersA = new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> losersA = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> votesA = new ArrayList<Integer>();
	
	
	Random rand = new Random();
	
	public static void main(String[] args)
	{
		
	}
	
	public void setArrays(int voterNum, int cansNum)
	{
		for(int i = 0; i < voterNum; i++)
		{
			this.votesA.clear();
			for(int j = 0; j < cansNum-1; j++)
			{
				this.votesA.add(rand.nextInt(cansNum+1));
			}
			this.votersA.add(votesA);
		}
	}
	
	public void getRoundWinner()
	{
		
	}
	
	public void addLosers()
	{
		
	}
	
	public void checkVoter(int vote, int voter)
	{
		if(votersA.get(voter).get(vote).equals(0))
			votersA.remove(voter);
	}
}
