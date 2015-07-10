package voting;

public class Driver {
	
	static Voting_model vm = new Voting_model();
	static Voting_controller vc = new Voting_controller();
	static Voting_view vv = new Voting_view();
	
	public Driver()
	{
		vv.setModel(vm);
		vc.setModel(vm);
		vc.setView(vv);
	}
	
	public static void main(String[] args)
	{
		new Driver();
	}

}
