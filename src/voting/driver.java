package voting;

public class driver {
	
	static Voting_model vm = new Voting_model();
	static Voting_controller vc = new Voting_controller(vm);
	static Voting_view vote = new Voting_view(vc);
	
	public static void main(String[] args)
	{
		
	}

}
