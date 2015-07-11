package voting;

public class Driver {
	
	static VotingModel vm = new VotingModel();
	static VotingController vc = new VotingController();
	static VotingView vv = new VotingView();
	
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
